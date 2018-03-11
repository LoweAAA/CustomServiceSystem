package com.givemefive.customerservicesystem.repostory;


import com.givemefive.customerservicesystem.model.Mytable;

import java.util.List;

public interface MytableDao {
    List<Mytable> getall();

    void save(Mytable mytable);
}
