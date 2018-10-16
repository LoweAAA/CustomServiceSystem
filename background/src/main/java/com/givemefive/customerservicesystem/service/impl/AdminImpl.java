package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.bean.Admin;
import com.givemefive.customerservicesystem.model.VO.VOConstant;
import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.repostory.AdminDao;
import com.givemefive.customerservicesystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
                result.setERRmessage(VOConstant.WRONG_ID_ERROR);
            }else if(admin.getAdminPass().equals(password) ){
                result.setComplete(true);
                result.setERRmessage(VOConstant.SUCCESSFUL);
            }else {
                result.setERRmessage(VOConstant.FAIL);
            }
        }catch (Exception e){
            System.out.println(e);
            result.setERRmessage(VOConstant.UNKNOWERROR);
        }

        return result;
    }
}
