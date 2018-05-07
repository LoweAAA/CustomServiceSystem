package com.givemefive.customerservicesystem.service.impl;


import com.givemefive.customerservicesystem.model.CustomerService;
import com.givemefive.customerservicesystem.repostory.CustomerserviceDao;
import com.givemefive.customerservicesystem.service.CSservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSserviceImpl implements CSservice {

    @Autowired
    private CustomerserviceDao customerserviceDao;

@Override
    public CustomerService loginConfirm(String id, String password) {
        CustomerService customerService = customerserviceDao.queryByID(id);
        if (customerService == null)
            return null;
        if (customerService.getCsPassword().equals(password)){
            return customerService;
        }
        else {
            return null;
        }
    }

@Override
    public void addAccount(CustomerService customerService) {
        customerserviceDao.save(customerService);
    }
@Override
    public void delete(String id) {
        customerserviceDao.delete(id);
    }

@Override
    public void update(CustomerService customerService) {
        customerserviceDao.update(customerService);
    }

    @Override
    public List<CustomerService> byCompanyName(String name) {
        List<CustomerService> cslist = customerserviceDao.queryByComName(name);
        if(cslist == null){
            return null;
        }
        else{
            return cslist;
        }
    }
}
