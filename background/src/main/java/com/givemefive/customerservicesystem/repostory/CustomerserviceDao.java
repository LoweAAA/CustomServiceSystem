package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.bean.CustomerService;

import java.util.List;

public interface CustomerserviceDao {
    List<CustomerService> getAll();

    void save(CustomerService Customerservice);

    void update(CustomerService Customerservice);

    void delete(String id);

    CustomerService queryByID(String id);

    List<CustomerService> queryByComName(String name);
}
