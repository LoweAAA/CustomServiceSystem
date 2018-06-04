package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.Category;
import com.givemefive.customerservicesystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class CateController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("queryByComName")
    @ResponseBody
    public Map queryByComName(@RequestParam("com_name") String com_name){
        Map map = new HashMap();

        List<Category> cateList =  categoryService.queryByCom(com_name);
        if (cateList == null){
            map.put("data",null);
            map.put("status","没有符合的类别！");
        }else {
            map.put("data",cateList);
            map.put("status","查找成功");
        }
        return map;

    }


    @RequestMapping("getAllCate")
    @ResponseBody
    public Map queryByComName(){
        Map map = new HashMap();

        List<Category> cateList =  categoryService.getAll();
        if (cateList == null){
            map.put("data",null);
            map.put("status","类别为空");
        }else {
            map.put("data",cateList);
            map.put("status","查找成功");
        }
        return map;

    }

}
