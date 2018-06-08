package com.givemefive.customerservicesystem.service.impl;


import com.givemefive.customerservicesystem.model.AskForLeave;
import com.givemefive.customerservicesystem.model.SystemQuestion;
import com.givemefive.customerservicesystem.repostory.AskForLeaveDao;
import com.givemefive.customerservicesystem.service.AskForLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AklImpl implements AskForLeaveService{


    @Autowired
    private AskForLeaveDao askForLeaveDao;




    @Override
    public List<AskForLeave> getAll() {

        List<AskForLeave> list = askForLeaveDao.getAll();
        return list;

    }

    @Override
    public Boolean addAfl(AskForLeave askForLeave) {
        if(askForLeave == null){
            System.out.println("Leave数据为空");
            return false;
        }else{
            askForLeaveDao.addAfl(askForLeave);
            return true;
        }
    }

    @Override
    public List<AskForLeave> queryByName(String name) {
        List<AskForLeave> list = askForLeaveDao.queryByName(name);
        return list;
    }

    @Override
    public Boolean update(AskForLeave askForLeave) {
        if (askForLeave.getCsName() == null){
            return false;
        }else {
            askForLeaveDao.update(askForLeave);
            return true;
        }
    }
}
