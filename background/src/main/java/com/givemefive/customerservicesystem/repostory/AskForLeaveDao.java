package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.bean.AskForLeave;

import java.util.List;

public interface AskForLeaveDao {

    List<AskForLeave> getAll();

    void addAfl(AskForLeave askForLeave);

    List<AskForLeave> queryByName(String name);

    void update(AskForLeave askForLeave);


}
