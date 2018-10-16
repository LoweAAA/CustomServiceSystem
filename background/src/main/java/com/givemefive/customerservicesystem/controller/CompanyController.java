package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.model.VO.CompanyVO;
import com.givemefive.customerservicesystem.model.bean.Company;
import com.givemefive.customerservicesystem.service.CompanyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/company")
public class CompanyController {

    public static Logger logger = Logger.getLogger(CompanyController.class.getName());
    @Autowired
    private CompanyService companyService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result Loginconfirm(@RequestParam("com_mail") String mail, @RequestParam("com_password") String password){


        Result loginResult = companyService.loginconfirm(mail,password);

        return loginResult;

        //return new ModelAndView("index.html",map);
    }


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public Result test(@RequestBody HttpServletRequest request){

        Result loginResult = new Result();
        logger.info(request.getMethod());
        logger.info(request.getRequestURI());
        logger.info(request.getParameter("com_password"));

        return loginResult;

        //return new ModelAndView("index.html",map);
    }


    @RequestMapping(value = "/getCominfo",method = RequestMethod.POST)
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
