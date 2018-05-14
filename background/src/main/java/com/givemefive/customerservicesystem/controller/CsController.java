package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.CustomerService;
import com.givemefive.customerservicesystem.repostory.CustomerserviceDao;
import com.givemefive.customerservicesystem.service.CSservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class CsController {
    @Autowired
    private CSservice loginService;
    @Autowired
    private CustomerserviceDao customerserviceDao;

    @RequestMapping("loginconfirm")
    @ResponseBody
    public Map loginConfirm(@RequestParam("id") String id, @RequestParam("password") String password){
        Map map=new HashMap();
        CustomerService customerService=loginService.loginConfirm(id,password);
        map.put("data",customerService);
        if(customerService==null){
            map.put("status","账号密码错误");    //将key-value存入map中
        }
        else map.put("status","账号密码正确");
        return map;
    }


    @RequestMapping("queryCsByCom")
    @ResponseBody
    public Map queryCsByCom(@RequestParam("name") String name ){
        Map map=new HashMap();
        List<CustomerService> cslist =customerserviceDao.queryByComName(name);
        map.put("data",cslist);
        if(cslist==null){
            map.put("status","没有找到客服！");    //将key-value存入map中
        }
        else map.put("status","查找成功！");
        return map;
    }
/*
    @RequestMapping("login")
    public String login(){
        return "cs_login";
    }

    */
}
