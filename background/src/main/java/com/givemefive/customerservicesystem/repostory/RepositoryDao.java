package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.bean.Repository;

import java.util.List;


public interface RepositoryDao {

    void addQuestion(Repository repository);

    void delete(String id);

    void update(Repository repository);

    Repository queryById(String id);

    /*List<Repository> queryByCate(String cateName);*/

    List<Repository> getAll();


}
