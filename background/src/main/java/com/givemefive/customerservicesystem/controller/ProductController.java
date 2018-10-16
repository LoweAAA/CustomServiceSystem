package com.givemefive.customerservicesystem.controller;



import com.givemefive.customerservicesystem.model.bean.Product;
import com.givemefive.customerservicesystem.repostory.ProductDao;
import com.givemefive.customerservicesystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductDao productDao;


    @RequestMapping("queryProductByCom")
    @ResponseBody
    public Map queryProductByCom(@RequestParam("name") String name){
        System.out.println("enter Controller successfully!");
        Map map=new HashMap();
        List<Product> productList = productService.queryByComName(name);
        map.put("data",productList);
        if(productList==null){
            map.put("status","没有产品");    //将key-value存入map中
        }
        else map.put("status","产品查找成功");
        return map;
    }


    @RequestMapping("queryProductByCate")
    @ResponseBody
    public Map queryProductByCate(@RequestParam("name") String name){
        Map map=new HashMap();
        List<Product> productList = productService.queryByCateName(name);
        map.put("data",productList);
        if(productList==null){
            map.put("status","没有产品");    //将key-value存入map中
        }
        else map.put("status","产品查找成功");
        return map;
    }


    @RequestMapping("productgetall")
    @ResponseBody
    public Map getAll(){
        Map map = new HashMap();
        List<Product> productList = productService.getAll();
        map.put("data",productList);
        if(productList==null){
            map.put("status","没有产品");    //将key-value存入map中
        }
        else map.put("status","返回所有产品");
        return map;
    }




}
