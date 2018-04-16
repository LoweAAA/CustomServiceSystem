package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.CustomerService;
import com.givemefive.customerservicesystem.service.Loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;
import java.util.HashMap;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class cslogin {
    @Autowired
    private Loginservice loginService;

    @RequestMapping("loginconfirm")
    @ResponseBody
    public Map loginConfirm(@RequestParam("id") String id, @RequestParam("password") String password){
        System.out.println("id="+id+" password="+password);
        Map map=new HashMap();
        CustomerService customerService=loginService.loginConfirm(id,password);
        map.put("data",customerService);
        if(customerService==null){
            map.put("status","账号密码错误");    //将key-value存入map中
        }
        else map.put("status","账号密码正确");
        return map;
    }

    @RequestMapping("login")
    public String login(){
        return "cs_login";
    }
}
