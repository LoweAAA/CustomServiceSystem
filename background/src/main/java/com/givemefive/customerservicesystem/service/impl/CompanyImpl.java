package com.givemefive.customerservicesystem.service.impl;


import com.givemefive.customerservicesystem.model.Constant.Constant;
import com.givemefive.customerservicesystem.model.VO.VOConstant;
import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.model.bean.Company;
import com.givemefive.customerservicesystem.repostory.CompanyDao;
import com.givemefive.customerservicesystem.service.CompanyService;
import com.givemefive.customerservicesystem.service.util.utilImpl.MD5Util;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scala.collection.immutable.Stream;

import java.util.List;

@Service
public class CompanyImpl implements CompanyService{

    public static Logger logger = Logger.getLogger(CompanyService.class.getName());

    @Autowired
    private CompanyDao companyDao;


    @Override
    public void addCompany(Company company){
        companyDao.save(company);
    }

    @Override
    public  void delete(String id){
        companyDao.delete(id);
    }


    @Override
    public void update(Company company){
        companyDao.update(company);
    }


    @Override
    public List<Company> getAll(){
        return  companyDao.getAll();
    }


    @Override
    public Result loginconfirm(String mail, String password){
        Result result = new Result();
        try {
            Company company = companyDao.queryByMail(mail);
            result.setFlag(Constant.LOGIN_CONFIRM_FAILD);
            if(company == null) {//id不在库中
                result.writeToResult(null,Constant.LOGIN_CONFIRM_FAILD,VOConstant.WRONG_ID_ERROR,true);
                //return null;
            }
            if(company.getCompanyPassword().equals(password)){
                result.writeToResult(company,Constant.LOGIN_CONFIRM_PASS,VOConstant.LOGINCONFIRM_PASS,true);
                //生成token
                String token = MD5Util.MD5EncodeUtf8Token(company.getCompanyId() + Constant.TOKEN_MD5_PART);
                result.setToken(token);
            }else{//密码错误
                result.writeToResult(null,Constant.LOGIN_CONFIRM_FAILD,VOConstant.LOGINCONFIRM_FAILD,true);
            }
        }catch (Exception e){
            result.setComplete(false);
            logger.error(result,e);
        }
        logger.info(result);
        return result;

    }

    @Override
    public Company queryById(String id){
        Company company = companyDao.queryById(id);
        if(company == null) {
            return null;
        }else{
            return company;
        }
    }




}
