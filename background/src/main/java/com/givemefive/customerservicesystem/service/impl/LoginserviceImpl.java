package com.givemefive.customerservicesystem.service.impl;


import com.givemefive.customerservicesystem.model.CustomerService;
import com.givemefive.customerservicesystem.repostory.CustomerserviceDao;
import com.givemefive.customerservicesystem.service.Loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginserviceImpl implements Loginservice {

    @Autowired
    private CustomerserviceDao customerseviceDao;

@Override
    public CustomerService loginConfirm(String id, String password) {
        CustomerService customerService = customerseviceDao.queryByID(id);
        if (customerService == null)
            return null;
        if (customerService.getCsPassword().equals(password))
            return customerService;
        else {
            return null;
        }
    }

@Override
    public void addAccount(CustomerService customerService) {
        customerseviceDao.save(customerService);
    }
@Override
    public void delete(String id) {
        customerseviceDao.delete(id);
    }

@Override
    public void update(CustomerService customerService) {
        customerseviceDao.update(customerService);
    }
}
