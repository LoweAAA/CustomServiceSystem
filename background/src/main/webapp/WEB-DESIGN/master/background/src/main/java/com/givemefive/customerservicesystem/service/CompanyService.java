package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.Company;

import java.util.List;

public interface CompanyService {

    void addCompany(Company company);

    void delete(String id);

    void update(Company company);

    List<Company> getAll();

    String loginconfirm(String mail,String password);

    Company queryById(String id);

}
