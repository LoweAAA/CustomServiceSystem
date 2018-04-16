package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.CustomerService;

public interface Loginservice {

    public CustomerService loginConfirm(String id, String password);

    public void addAccount(CustomerService customerService);

    public void delete(String id);

    public void update(CustomerService customerServiceervice);

}
