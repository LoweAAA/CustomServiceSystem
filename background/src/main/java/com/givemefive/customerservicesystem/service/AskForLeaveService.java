package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.AskForLeave;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface AskForLeaveService {

    List<AskForLeave> getAll();

    Boolean addAfl(AskForLeave askForLeave);

    List<AskForLeave> queryByName(String name);

    Boolean update(AskForLeave askForLeave);

}
