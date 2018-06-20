package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.Constant.Constant;
import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.model.Repository;
import com.givemefive.customerservicesystem.service.RepositorySerivce;
import com.givemefive.customerservicesystem.service.util.GetRecentDateService;
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
public class RepositoryController {

    @Autowired
    private RepositorySerivce repositorySerivce;

    private GetRecentDateService getRecentDateService;

    private Result result = new Result();

    @RequestMapping("addRepos")
    @ResponseBody
    public Map addRepository(@RequestParam("quesId") String id, @RequestParam("reposQues") String question,
                             @RequestParam("reposAnswer") String answer,@RequestParam("reposKeywords") String keywords){
        Map map = new HashMap();

        Repository repository = new Repository();

        java.util.Date date = getRecentDateService.getToday();
        repository.build(id,question,answer,keywords,date);
        result = repositorySerivce.addQuestion(repository);
        if(!result.isComplete()){
            map.put("status",result.getERRmessage());
        }else {
            map.put("status",result.getERRmessage());
        }

        return map;
    }

    @RequestMapping("updateRepos")
    @ResponseBody
    public Map updateRepository(@RequestParam("reposId") String reposId, @RequestParam("pro_ques_Id") String pro_ques_Id,
                                @RequestParam("reposQues") String reposQues, @RequestParam("reposAnswer") String reposAnswer,
                                @RequestParam("reposKeywords") String reposKeywords, @RequestParam("reposState") Integer reposState,
                                @RequestParam("reposCosultTime") String reposCosultTime, @RequestParam("editor") String editor){
        Map map = new HashMap();
        Repository repository = new Repository();
        java.util.Date date = getRecentDateService.getToday();
        repository.build(reposId,reposQues,reposAnswer,reposKeywords, date);
        repository.setProQuestionId(pro_ques_Id);
        repository.setRepositoryState(reposState);
        repository.setRepositoryConsultationTimes(reposState);
        repository.setRepositoryEditor(editor);

        result = repositorySerivce.update(repository);
        if(!result.isComplete()){
            map.put("status",result.getERRmessage());
        }else {
            map.put("status",result.getERRmessage());
        }
        return map;
    }

    @RequestMapping("deleteRepos")
    @ResponseBody
    public Map deleteRepository(@RequestParam("reposId") String id){
        Map map = new HashMap();
        result = repositorySerivce.delete(id);
        if(!result.isComplete()){
            map.put("status",result.getERRmessage());
        }else {
            map.put("status",result.getERRmessage());
        }
        return map;
    }


    @RequestMapping("getRepos")
    @ResponseBody
    public Map getRepos(){
        Map map = new HashMap();
        List<Repository> list = repositorySerivce.getRepos();
        if (list == null){
            map.put("data","");
        }else {
            map.put("data",list);
            map.put("status", Constant.SUCCESSFUL);
        }
        return map;
    }





}
