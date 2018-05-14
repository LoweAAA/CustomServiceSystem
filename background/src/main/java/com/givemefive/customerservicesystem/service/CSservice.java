package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.CustomerService;

import java.util.List;

public interface CSservice {

    CustomerService loginConfirm(String id, String password);

    void addAccount(CustomerService customerService);

    void delete(String id);

    void update(CustomerService customerServiceervice);

    List<CustomerService> byCompanyName(String name);

}
