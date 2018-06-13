package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.Coml;
import com.givemefive.customerservicesystem.model.Constant.Constant;
import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.service.ComlService;
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
public class ComlController {
    @Autowired
    private ComlService comlService;

    private Result result;
    private Constant constant = new Constant();
    private Coml coml;
    private Map<String,Object> map;

    @RequestMapping(value = "addComl")
    @ResponseBody
    public Map addComl(@RequestParam("comlQuestion") String comlQuestion,@RequestParam("comlSimilarQuestion") String comlSimilarQuestion,
                       @RequestParam("comlAnswer") String comlAnswer,@RequestParam("companyName") String companyName,
                       @RequestParam("editor") String editor){
        map = new HashMap<String,Object>();
        coml = new Coml();
        coml.build(comlQuestion,comlSimilarQuestion,comlAnswer,companyName,editor);
        result = comlService.addComl(coml);

        map.put("status",result.getERRmessage());
        return map;
    }


    @RequestMapping(value = "updateComl")
    @ResponseBody
    public Map updateComl(@RequestParam("comlId") int id, @RequestParam("comlQuestion") String comlQuestion,
                          @RequestParam("comlSimilarQuestion") String comlSimilarQuestion,@RequestParam("comlDate") Date date,
                          @RequestParam("comlAnswer") String comlAnswer,@RequestParam("comlstate") int state,
                          @RequestParam("companyName") String companyName, @RequestParam("editor") String editor){
        map = new HashMap<String,Object>();
        try{
                coml.setComlQuestion(comlQuestion);
                coml.setComlSimilarQuestion(comlSimilarQuestion);
                coml.setComlCreattime(date);
                coml.setComlAnswer(comlAnswer);
                coml.setCompanyName(companyName);
                coml.setComlState(state);
                coml.setComlEditor(editor);
                result = comlService.update(coml);
                map.put("status",result.getERRmessage());
        }catch (Exception e){
                System.out.println(e);
                map.put("status",constant.CONTROLLER_UNKOWERROR);
        }

        return map;
    }

    @RequestMapping(value = "ComlqueryByCom")
    @ResponseBody
    public Map queryByComName(@RequestParam("comName") String companyName){
        map = new HashMap<>();
        List<Coml> list = comlService.queryByCom(companyName);
        if(list == null){
            map.put("data",null);
            map.put("status",constant.DATA_IS_EMPTY);
        }else {
            map.put("data", list);
            map.put("status", constant.SUCCESSFUL);
        }
        return map;
    }


    @RequestMapping("ComlgetAll")
    @ResponseBody
    public Map getAll(){
        map = new HashMap<>();
        List<Coml> list = comlService.getAll();
        if(list == null){
            map.put("data",null);
            map.put("status",constant.DATA_IS_EMPTY);
        }else{
            map.put("data",list);
            map.put("status",constant.SUCCESSFUL);
        }
        return map;
    }


    @RequestMapping("comlDelete")
    @ResponseBody
    public Map delete(@RequestParam("comlId") int id){
        map = new HashMap<>();
        result = comlService.delete(id);
        map.put("status",result.getERRmessage());
        return map;
    }




}
