package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.Company;

import java.util.List;

public interface CompanyDao {

    List<Company> getAll();

    void save(Company company);

    void update(Company company);

    void delete(String id);

    Company queryByMail(String mail);

    Company queryById(String id);


}
