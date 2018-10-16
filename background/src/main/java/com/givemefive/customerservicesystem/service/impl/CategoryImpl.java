package com.givemefive.customerservicesystem.service.impl;


import com.givemefive.customerservicesystem.model.bean.Category;
import com.givemefive.customerservicesystem.repostory.CategoryDao;
import com.givemefive.customerservicesystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements CategoryService{
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAll(){
        return categoryDao.getAll();
    }

    @Override
    public List<Category> queryByCom(String comname) {
        return categoryDao.queryByCom(comname);
    }
}
