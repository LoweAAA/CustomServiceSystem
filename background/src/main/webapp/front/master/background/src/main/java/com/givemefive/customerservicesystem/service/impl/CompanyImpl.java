package com.givemefive.customerservicesystem.service.impl;


import com.givemefive.customerservicesystem.model.Company;
import com.givemefive.customerservicesystem.repostory.CompanyDao;
import com.givemefive.customerservicesystem.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyImpl implements CompanyService{
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
    public String loginconfirm(String mail,String password){
        Company company = companyDao.queryByMail(mail);
        if(company == null) {
            return null;
        }
        if(company.getCompanyPassword().equals(password)){
            return company.getCompanyId();
        }else{
            return null;
        }
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
