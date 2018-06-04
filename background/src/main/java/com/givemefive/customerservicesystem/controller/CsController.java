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
    private CSservice csService;
    @Autowired
    private CustomerserviceDao customerserviceDao;

    @RequestMapping("cslogin")
    @ResponseBody
    public Map loginConfirm(@RequestParam("cs_id") String id, @RequestParam("cs_password") String password){
        Map map=new HashMap();
        CustomerService customerService=csService.loginConfirm(id,password);
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




    @RequestMapping("CSgetinfo")
    @ResponseBody
    public  Map getinfo(@RequestParam("CSid") String id){
        Map map = new HashMap();
        CustomerService customerService = csService.queryById(id);
        map.put("data",customerService);
        if(customerService == null){
            map.put("status","客服信息为空");
        }else {
            map.put("status","客服信息查找成功");
        }
        return map;
    }





    @RequestMapping("CSsignin")
    @ResponseBody
    public Map register(@RequestParam("name") String name,@RequestParam("companyname") String companyname,@RequestParam("contractinfo") String contractinfo,
                        @RequestParam("account") String account,@RequestParam("id") String id,@RequestParam("password") String password){
        Map map = new HashMap();
        CustomerService customerService = new CustomerService(name,companyname,contractinfo,account,id,password);
        System.out.println(customerService);
        if(customerService==null){
            map.put("status","添加失败！");
        }else {
            csService.addAccount(customerService);
            map.put("status","添加成功！");
        }
        return map;
    }



    @RequestMapping("updateCS")
    @ResponseBody
    public Map updateCS(@RequestParam("csId") String csId, @RequestParam("csName") String csName,
                                @RequestParam("csAccount") String csAccount, @RequestParam("csPassword") String csPassword,
                                @RequestParam("csContract") String csContract, @RequestParam("csComName") String csComName){
        Map map = new HashMap();
        CustomerService customerService = new CustomerService(csName,csComName,csContract,csAccount,csId,csPassword);

        if(csService.update(customerService) == null){
            map.put("status","更新失败");
        }else {
            map.put("status","更新成功");
        }
        return map;
    }



/*
    @RequestMapping("login")
    public String login(){
        return "cs_login";
    }

    */
}
