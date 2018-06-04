package com.givemefive.customerservicesystem.service.impl;

import com.givemefive.customerservicesystem.model.Product;
import com.givemefive.customerservicesystem.repostory.ProductDao;
import com.givemefive.customerservicesystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductImpl implements ProductService {
    @Autowired
    private ProductDao productDao;



    public void addProduct(Product product){
        productDao.save(product);
    }

    public void delete(String id){
        productDao.delete(id);
    }

    public void update(Product product){
        productDao.update(product);
    }

    @Override
    public List<Product> queryByComName(String name) {
        List<Product> productslist = productDao.queryByComName(name);
        if(productslist == null){
            return null;
        }
        else{
            return productslist;
        }
    }

    @Override
    public List<Product> queryByCateName(String name) {
        List<Product> productslist = productDao.queryByCateName(name);
        if(productslist == null){
            return null;
        }
        else{
            return productslist;
        }
    }


    public List<Product> getAll(){
        List<Product> productList = productDao.getAll();
        return productList;
    }

}
