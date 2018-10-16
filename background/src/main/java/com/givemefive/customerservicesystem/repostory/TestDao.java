package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.bean.Test;

import java.util.List;

public interface TestDao {
    List<Test> getAll();

    void save(Test test);

    void update(Test test);

    void detele(Test test);
}
