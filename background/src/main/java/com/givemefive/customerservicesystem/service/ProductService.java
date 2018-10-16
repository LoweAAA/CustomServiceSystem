package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.bean.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void delete(String id);

    void update(Product product);

    List<Product> queryByCateName(String name);

    List<Product> queryByComName(String name);

    List<Product> getAll();

}
