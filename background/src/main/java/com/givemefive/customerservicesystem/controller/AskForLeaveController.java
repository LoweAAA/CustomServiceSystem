package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.AskForLeave;
import com.givemefive.customerservicesystem.service.AskForLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class AskForLeaveController {
    @Autowired
    private AskForLeaveService askForLeaveService;

    Map map = new HashMap();


    @RequestMapping("getAllLeave")
    @ResponseBody
    public Map getLeave(){
        List<AskForLeave> list = askForLeaveService.getAll();
        if(list == null){
            map.put("status","没有查询到请假信息！");
        }else {
            map.put("data",list);
            map.put("status","查询成功！");
        }
        return map;
    }



    @RequestMapping("AklqueryByName")
    @ResponseBody
    public Map queryByName(@RequestParam("Aklname") String name){
        List<AskForLeave> list = askForLeaveService.queryByName(name);
        if(list == null){
            map.put("status","此人没有请假信息！");
        }else {
            map.put("data",list);
            map.put("status","查询成功！");
        }
        return map;
    }




    @RequestMapping("addLeave")
    @ResponseBody
    public Map addLeave(@RequestParam("leaveName") String name, @RequestParam("leaveTime") Date date,@RequestParam("leaveReason") String reason){
        AskForLeave askForLeave = new AskForLeave(name,date,reason);
        if(askForLeaveService.addAfl(askForLeave)){
            map.put("status","更新成功！");
        }else {
            map.put("status","更新失败！");
        }
        return map;
    }



    @RequestMapping("updateLeave")
    @ResponseBody
    public Map updateLeave(@RequestParam("leaveName") String name,@RequestParam("leaveTime") Date date,@RequestParam("leaveReason") String reason,
                           @RequestParam("leaveResult") String result,@RequestParam("leaveReview") String review){
        AskForLeave askForLeave = new AskForLeave();
        askForLeave.setCsName(name);
        askForLeave.setAflTime(date);
        askForLeave.setNote(reason);
        askForLeave.setResult(result);
        askForLeave.setReview(review);

        if(askForLeaveService.update(askForLeave)){
            map.put("status","更新成功！");
        }else {
            map.put("status","更新失败！");
        }
        return map;

    }




}
