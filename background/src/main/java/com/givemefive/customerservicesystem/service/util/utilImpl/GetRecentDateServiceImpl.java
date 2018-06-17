package com.givemefive.customerservicesystem.service.util.utilImpl;

import com.givemefive.customerservicesystem.service.util.GetRecentDateService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
public class GetRecentDateServiceImpl implements GetRecentDateService {

    private java.util.Date today = new java.util.Date();

    /*
    获取当前时间
    @author yuyin
    2018.6.17
    */
    @Override
    public java.util.Date getToday() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String ss = sdf.format(today);
        java.util.Date date = null;
        try {
            date = sdf.parse(ss);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


}
