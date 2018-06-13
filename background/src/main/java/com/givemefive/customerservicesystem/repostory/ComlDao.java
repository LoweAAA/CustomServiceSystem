package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.Coml;

import java.util.List;

public interface ComlDao {

    void addComl(Coml coml);

    void update(Coml coml);

    void delete(int id);

    List<Coml> queryByCom(String comName);

    Coml queryById(int id);

    List<Coml> getAll();

}
