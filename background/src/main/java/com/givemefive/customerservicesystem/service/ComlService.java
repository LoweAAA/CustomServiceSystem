package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.bean.Coml;
import com.givemefive.customerservicesystem.model.Constant.Result;

import java.util.List;

public interface ComlService {

    Result addComl(Coml coml);

    Result update(Coml coml);

    Result delete(int id);

    List<Coml> queryByCom(String comName);

    Coml queryById(int id);

    List<Coml> getAll();

}
