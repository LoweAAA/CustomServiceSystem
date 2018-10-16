package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.bean.ProductQuestion;

import java.util.List;

public interface ProdQuesService {
    List<ProductQuestion> getAll();

    void addQues(ProductQuestion productQuestion);

    void update(ProductQuestion productQuestion);
}
