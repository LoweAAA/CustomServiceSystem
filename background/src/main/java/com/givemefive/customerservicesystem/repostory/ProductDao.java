package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();

    void save(Product product);

    void update(Product product);

    void delete(String id);

    public Product queryByID(String id);
}
