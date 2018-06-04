package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.Product;
import com.givemefive.customerservicesystem.model.ProductQuestion;

import java.util.List;

public interface ProdQuesDao {

    List<ProductQuestion> getAll();

    void addQues(ProductQuestion productQuestion);

    void updateQues(ProductQuestion productQuestion);



}
