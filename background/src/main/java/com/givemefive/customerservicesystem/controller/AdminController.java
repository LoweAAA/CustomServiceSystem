package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.Constant.Constant;
import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class AdminController {

    @Autowired
    private AdminService adminService;

    private Map map = new HashMap();


    @RequestMapping("adminLogin")
    @ResponseBody
    public Map adminLogin(@RequestParam("mail") String mail, @RequestParam("password") String password){

        Result result = adminService.loginConfirm(mail,password);
        if (result.isComplete()){
            map.put("data",true);
            map.put("status", Constant.SUCCESSFUL);
        }else {
            map.put("data",false);
            map.put("status",Constant.FAIL);
        }
        return map;

    }



}
