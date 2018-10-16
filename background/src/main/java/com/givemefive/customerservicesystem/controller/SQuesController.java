package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.bean.SystemQuestion;
import com.givemefive.customerservicesystem.service.SQuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class SQuesController {
    @Autowired
    private SQuesService sQuesService;



    @RequestMapping("addSQues")
    @ResponseBody
    public Map addSQues(@RequestParam("sqId") Integer id, @RequestParam("sqQues") String sqQues,
                        @RequestParam("sqAnswer") String sqAnswer){
        Map map = new HashMap();
        SystemQuestion systemQuestion = new SystemQuestion(id,sqQues,sqAnswer);
        if(systemQuestion == null){
            map.put("status","添加失败");
        }else {
            map.put("status","添加成功");
        }
        return map;
    }


    @RequestMapping("getAllSQ")
    @ResponseBody
    public Map getAllSQ(){
        Map map = new HashMap();
        List<SystemQuestion> list = sQuesService.getAll();
        map.put("data",list);
        if(list==null){
            map.put("status","没有找到系统问题！");    //将key-value存入map中
        }
        else map.put("status","查找成功！");
        return map;
    }




}
