package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.CustomerService;
import com.givemefive.customerservicesystem.repostory.CustomerserviceDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CustomerserviceDaoImpl implements CustomerserviceDao{
    private String hql;

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }

    public void save(CustomerService Customerservice) {
        session().save(Customerservice);
    }

    public void delete(String id) {
        hql = "DELETE FROM CustomerService l WHERE l.id = ?";
        session().createQuery(hql).setParameter(0, id).executeUpdate();
    }

    public void update(CustomerService Customerservice) {
        session().update(Customerservice);
    }

    public List<CustomerService> getAll() {
        hql="FROM CustomerService ";
        return session().createQuery(hql).list();
    }

    public CustomerService queryByID(String id) {
        hql = "FROM CustomerService a WHERE a.csId = ?";
        return (CustomerService) session().createQuery(hql).setParameter(0, id).uniqueResult();
    }

    public List<CustomerService> queryByComName(String name){
        hql = "SELECT a FROM CustomerService a,Company b WHERE a.csCompanyId = b.companyId and b.companyName=?";
        return session().createQuery(hql).setParameter(0, name).list();
    }

}
