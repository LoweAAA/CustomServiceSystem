package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.Constant.Result;
import com.givemefive.customerservicesystem.model.bean.Company;

import java.util.List;

public interface CompanyService {

    void addCompany(Company company);

    void delete(String id);

    void update(Company company);

    List<Company> getAll();

    Result loginconfirm(String mail, String password);

    Company queryById(String id);

}
