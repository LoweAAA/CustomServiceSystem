package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.bean.SystemQuestion;
import com.givemefive.customerservicesystem.repostory.SystemQuesDao;
import com.givemefive.customerservicesystem.service.SQuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SQuesImpl implements SQuesService {

    @Autowired
    private SystemQuesDao systemQuesDao;


    @Override
    public void addQues(SystemQuestion systemQuestion) {
        if (systemQuestion == null) {

        } else {
            systemQuesDao.addQues(systemQuestion);
        }
    }

    @Override
    public List<SystemQuestion> getAll() {
        List<SystemQuestion> list = systemQuesDao.getAll();
        if (list.size() != 0) {
            return list;
        } else {
            return null;
        }
    }
}
