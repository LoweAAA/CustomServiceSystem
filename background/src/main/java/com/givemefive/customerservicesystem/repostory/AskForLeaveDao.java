package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.AskForLeave;
import org.codehaus.jackson.annotate.JsonTypeInfo;

import java.util.List;

public interface AskForLeaveDao {

    List<AskForLeave> getAll();

    void addAfl(AskForLeave askForLeave);

    List<AskForLeave> queryByName(String name);

    void update(AskForLeave askForLeave);


}
