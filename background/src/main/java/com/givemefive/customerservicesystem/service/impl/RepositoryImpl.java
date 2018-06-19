package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.Constant.Constant;
import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.model.Repository;
import com.givemefive.customerservicesystem.repostory.RepositoryDao;
import com.givemefive.customerservicesystem.service.RepositorySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scala.collection.immutable.Stream;

import java.util.ArrayList;
import java.util.List;


@Service
public class RepositoryImpl implements RepositorySerivce {

    @Autowired
    private RepositoryDao repositoryDao;

    private String id;
    private Result result;


    @Override
    public Result addQuestion(Repository repository){
        result = new Result();
        try{
            repositoryDao.addQuestion(repository);
            result.setERRmessage(Constant.ADD_SUCCESSFUL);
            result.setComplete(true);
            System.out.println("222");
        }catch (Exception e){
            System.out.println("qqqqq"+e);
            result.setERRmessage(Constant.ADD_FAILED+":"+e);
        }
        return result;
    }


    @Override
    public Result delete(String id){
        try {
            repositoryDao.delete(id);
            result.setComplete(true);
            result.setERRmessage(Constant.DELETE_SUCCESSFUL);
        }catch (Exception e){
            System.out.println(e);
            result.setERRmessage(Constant.DELETE_FAILED+":"+e);
        }
        return result;
    }


    @Override
    public Result update(Repository repository){
        result = new Result();
        try{
            Repository repository1 = repositoryDao.queryById(repository.getRepositoryId());
            if(repository1 == null){
                result.setERRmessage(Constant.DATA_IS_EMPTY);
            }else {
                repositoryDao.update(repository);
                result.setERRmessage(Constant.UPDATE_SUCCESSFUL);
                result.setComplete(true);
            }
        }catch (Exception e){
            System.out.println(e);
            result.setERRmessage(Constant.UPDATE_FAILED+":"+e);
        }
        return result;


    }

    @Override
    public List<Repository> getRepos() {
        try {
            List<Repository> list = repositoryDao.getAll();
            return list;
        }catch (Exception e){
            System.out.println(Constant.UNKNOWERROR+":"+e);
            return null;
        }

    }


}
