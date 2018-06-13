package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.Repository;
import com.givemefive.customerservicesystem.repostory.RepositoryDao;
import com.givemefive.customerservicesystem.service.RepositorySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RepositoryImpl implements RepositorySerivce {

    @Autowired
    private RepositoryDao repositoryDao;

    private String id;


    @Override
    public void addQuestion(Repository repository){
        repositoryDao.addQuestion(repository);
    }


    @Override
    public void delete(String id){
        repositoryDao.delete(id);
    }


    @Override
    public String update(Repository repository){
        Repository repository1 = repositoryDao.queryById(repository.getRepositoryId());
        if(repository1 == null){
            return null;
        }else {
            repositoryDao.update(repository);
            return "ok";
        }


    }

    @Override
    public List<Repository> getRepos() {
        List<Repository> list = new ArrayList<>();
        if(true){
            list = repositoryDao.getAll();
        }

        return list;

    }


}
