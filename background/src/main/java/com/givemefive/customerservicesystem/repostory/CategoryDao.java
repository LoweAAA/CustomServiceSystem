package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.bean.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> getAll();

    List<Category> queryByCom(String comname);

}
