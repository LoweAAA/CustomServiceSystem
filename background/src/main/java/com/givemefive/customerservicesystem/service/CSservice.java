package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.bean.CustomerService;

import java.util.List;

public interface CSservice {

    CustomerService loginConfirm(String id, String password);

    void addAccount(CustomerService customerService);

    List<CustomerService> getAll();

    void delete(String id);

    String update(CustomerService customerServiceervice);

    List<CustomerService> byCompanyName(String name);

    CustomerService queryById(String id);

}
