package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.Company;
import com.givemefive.customerservicesystem.repostory.CompanyDao;
import com.givemefive.customerservicesystem.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class CompanyController {
    @Autowired
    private CompanyService companyService;


    @RequestMapping(value = "ComLoginconfirm")
    @ResponseBody
    public Map test(@RequestParam("com_mail") String mail, @RequestParam("com_password") String password){
        Map map = new HashMap();
        String company = companyService.loginconfirm(mail,password);

        map.put("data",company);
        if(company == null){
            map.put("status","false");    //将key-value存入map中
        }
        else map.put("status","ok");


        return map;

        //return new ModelAndView("index.html",map);
    }

    @RequestMapping("getinfo")
    @ResponseBody
    public Map getinfo(@RequestParam("com_id") String id){
        Map map = new HashMap();
        Company company = companyService.queryById(id);
        //System.out.println(id);
        map.put("data",company);
        System.out.println(company.getCompanyName()+"1");
        if(company == null){
            map.put("status","false");    //将key-value存入map中
        }
        else map.put("status","ok");
        //System.out.println(map);
        return map;
    }


}
