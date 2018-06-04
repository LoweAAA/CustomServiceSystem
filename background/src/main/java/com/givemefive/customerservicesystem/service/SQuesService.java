package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.SystemQuestion;

import java.util.List;

public interface SQuesService {

    void addQues(SystemQuestion systemQuestion);

    List<SystemQuestion> getAll();

}
