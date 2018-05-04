package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.Product;
import com.givemefive.customerservicesystem.repostory.ProductDao;
import com.givemefive.customerservicesystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

/*
    public String loginConfirm(String id, String password) {
        CustomerService customerService = customerseviceDao.queryByID(id);
        if (customerService == null)
            return null;
        if (customerService.getCsPassword().equals(password))
            return customerService;
        else {
            return null;
        }
    }
*/

    public void addProduct(Product product){
        productDao.save(product);
    }

    public void delete(String id){
        productDao.delete(id);
    }

    public void update(Product product){
        productDao.update(product);
    }

}
