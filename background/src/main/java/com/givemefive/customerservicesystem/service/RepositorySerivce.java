package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.model.Repository;

import java.util.List;

public interface RepositorySerivce {

    Result addQuestion(Repository repository);

    Result delete(String id);

    Result update(Repository repository);

    List<Repository> getRepos();

}
