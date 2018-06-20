package com.givemefive.customerservicesystem.service.util.utilImpl;

import com.givemefive.customerservicesystem.service.util.GetRecentDateService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
public class GetRecentDateServiceImpl implements GetRecentDateService {


    /*
    获取当前时间
    @author yuyin
    2018.6.17
    */
    @Override
    public java.util.Date getToday() {

        java.util.Date today = new java.util.Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String ss = sdf.format(today);
        java.util.Date date = null;
        try {
            date = sdf.parse(ss);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("aaa");
        }
        return date;


    }


}
