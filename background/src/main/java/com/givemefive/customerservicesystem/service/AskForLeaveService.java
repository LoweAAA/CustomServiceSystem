package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.bean.AskForLeave;

import java.util.List;

public interface AskForLeaveService {

    List<AskForLeave> getAll();

    Boolean addAfl(AskForLeave askForLeave);

    List<AskForLeave> queryByName(String name);

    Boolean update(AskForLeave askForLeave);

}
