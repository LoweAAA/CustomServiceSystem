package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.bean.ProductQuestion;
import com.givemefive.customerservicesystem.repostory.ProdQuesDao;
import com.givemefive.customerservicesystem.service.ProdQuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdQuesImpl implements ProdQuesService {

    @Autowired
    private ProdQuesDao prodQuesDao;

    @Override
    public List<ProductQuestion> getAll() {

        return prodQuesDao.getAll();
    }

    @Override
    public void addQues(ProductQuestion productQuestion) {
        prodQuesDao.addQues(productQuestion);
    }

    @Override
    public void update(ProductQuestion productQuestion) {
        prodQuesDao.updateQues(productQuestion);
    }
}
