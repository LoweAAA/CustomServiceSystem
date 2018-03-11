package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.Mytable;
import com.givemefive.customerservicesystem.repostory.MytableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private MytableDao mytableDao;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "2342";
    }

    @RequestMapping("/mytable")
    @ResponseBody
    public List<Mytable> mytable(){
        return mytableDao.getall();
    }
}
