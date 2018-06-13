package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.Repository;
import com.givemefive.customerservicesystem.service.RepositorySerivce;
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

    @RequestMapping("addRepos")
    @ResponseBody
    public Map addRepository(@RequestParam("quesId") String id, @RequestParam("reposQues") String question,
                             @RequestParam("reposAnswer") String answer,@RequestParam("reposKeywords") String keywords){
        Map map = new HashMap();

        Repository repository = new Repository(id,question,answer,keywords);
        if(repository == null){
            map.put("status","添加失败");
        }else {
            repositorySerivce.addQuestion(repository);
            map.put("status","添加成功");
        }

        return map;
    }

    @RequestMapping("updateRepos")
    @ResponseBody
    public Map updateRepository(@RequestParam("reposId") String reposId, @RequestParam("pro_ques_Id") String pro_ques_Id,
                                @RequestParam("reposQues") String reposQues, @RequestParam("reposAnswer") String reposAnswer,
                                @RequestParam("reposKeywords") String reposKeywords, @RequestParam("reposState") Integer reposState,
                                @RequestParam("reposCreatetime") Date reposCreatetime, @RequestParam("reposCosultTime") String reposCosultTime,
                                @RequestParam("editor") String editor){
        Map map = new HashMap();
        Repository repository = new Repository(reposId,reposQues,reposAnswer,reposKeywords);
        repository.setProQuestionId(pro_ques_Id);
        repository.setRepositoryState(reposState);
        repository.setRepositoryCreationTime(reposCreatetime);
        repository.setRepositoryConsultationTimes(reposState);
        repository.setRepositoryEditor(editor);

        if(repositorySerivce.update(repository) == null){
            map.put("status","更新失败");
        }else {
            map.put("status","更新成功");
        }
        return map;
    }

    @RequestMapping("deleteRepos")
    public void deleteRepository(@RequestParam("reposId") String id){
        repositorySerivce.delete(id);
    }


    @RequestMapping("getRepos")
    @ResponseBody
    public Map getRepos(){
        Map map = new HashMap();
        List<Repository> list = repositorySerivce.getRepos();
        map.put("data",list);
        map.put("status","查找所有问题");
        return map;
    }





}
