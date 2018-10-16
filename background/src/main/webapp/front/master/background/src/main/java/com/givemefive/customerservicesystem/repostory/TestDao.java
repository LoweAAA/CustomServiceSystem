package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.Record;
import com.givemefive.customerservicesystem.model.Test;

import java.util.List;

public interface TestDao {
    List<Test> getAll();

    void save(Test test);

    void update(Test test);

    void detele(Test test);
}
