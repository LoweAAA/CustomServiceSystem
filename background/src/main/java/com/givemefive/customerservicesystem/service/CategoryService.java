package com.givemefive.customerservicesystem.service;


import com.givemefive.customerservicesystem.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    List<Category> queryByCom(String comname);
}
