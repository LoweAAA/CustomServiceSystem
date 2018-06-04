package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.SystemQuestion;

import java.util.List;

public interface SystemQuesDao {

    void addQues(SystemQuestion systemQuestion);

    List<SystemQuestion> getAll();

}
