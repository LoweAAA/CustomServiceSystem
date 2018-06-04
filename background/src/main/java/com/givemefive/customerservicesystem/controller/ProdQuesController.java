package com.givemefive.customerservicesystem.controller;


import com.givemefive.customerservicesystem.model.ProductQuestion;
import com.givemefive.customerservicesystem.service.ProdQuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProdQuesController {
    @Autowired
    private ProdQuesService prodQuesService;

    @RequestMapping("addquestion")
    @ResponseBody
    public Map AddQuestion(@RequestParam("question_id") String questionid, @RequestParam("question_name") String questionname,
                           @RequestParam("product_id") String productid,@RequestParam("question_class") String questionclass){

        Map map = new HashMap();

        ProductQuestion productQuestion = new ProductQuestion();
        productQuestion.setProQuestionId(questionid);
        productQuestion.setProQuestionName(questionname);
        productQuestion.setProductId(productid);
        productQuestion.setQuestionClass(questionclass);


        if (productQuestion!= null){
            prodQuesService.addQues(productQuestion);
            map.put("status","add sucessfully");
        }else {
            map.put("status","add failed! The reason may be in Question input.(null or incompleted)");
        }
        return map;
    }




    @RequestMapping("updatequestion")
    @ResponseBody
    public Map updateQuestion(@RequestParam("question_id") String questionid, @RequestParam("question_name") String questionname,
                            @RequestParam("product_id") String productid,@RequestParam("question_class") String questionclass){

        Map map = new HashMap();

        ProductQuestion productQuestion = new ProductQuestion();
        productQuestion.setProQuestionId(questionid);
        productQuestion.setProQuestionName(questionname);
        productQuestion.setProductId(productid);
        productQuestion.setQuestionClass(questionclass);

        if (productQuestion!= null){
            prodQuesService.update(productQuestion);
            map.put("status","update sucessfully");
        }else {
            map.put("status","update failed! The reason may be in Question input.(null or incompleted)");
        }


        return map;


    }



}
