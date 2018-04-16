package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.Product;

public interface ProductService {

    public void addProduct(Product product);

    public void delete(String id);

    public void update(Product product);

}
