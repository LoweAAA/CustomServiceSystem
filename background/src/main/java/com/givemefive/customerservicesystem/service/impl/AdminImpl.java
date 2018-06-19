package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.Admin;
import com.givemefive.customerservicesystem.model.Constant.Constant;
import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.repostory.AdminDao;
import com.givemefive.customerservicesystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scala.collection.immutable.Stream;

@Service
public class AdminImpl implements AdminService{

    @Autowired
    private AdminDao adminDao;

    private Result result;


    @Override
    public Result loginConfirm(String mail, String password) {
        result = new Result();
        try {
            Admin admin = adminDao.queryByMail(mail);
            if (admin == null){
                result.setERRmessage(Constant.WRONG_ID_ERROR);
            }else if(admin.getAdminPass().equals(password) ){
                result.setComplete(true);
                result.setERRmessage(Constant.SUCCESSFUL);
            }else {
                result.setERRmessage(Constant.FAIL);
            }
        }catch (Exception e){
            System.out.println(e);
            result.setERRmessage(Constant.UNKNOWERROR);
        }

        return result;
    }
}
