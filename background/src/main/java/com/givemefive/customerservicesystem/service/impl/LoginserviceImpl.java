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
    System.out.println("inside 1! id="+id);
        CustomerService customerService = customerseviceDao.queryByID(id);
    System.out.println("inside 3!");
        if (customerService == null)
            return null;
        if (customerService.getCsPassword().equals(password)){
            System.out.println("inside 4!");
            return customerService;
        }
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
