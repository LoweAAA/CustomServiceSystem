package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.Company;
import com.givemefive.customerservicesystem.repostory.CompanyDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class CompanyDaoImpl implements CompanyDao {

    private String hql;

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }

    public void save(Company company){
        session().save(company);
    }

    public void update(Company company){
        session().update(company);
    }

    public void delete(String id){
        hql = "DELETE FROM Company l WHERE l.id = ?";
        session().createQuery(hql).setParameter(0, id).executeUpdate();
    }

    public List<Company> getAll(){
        hql = "FROM Company";
        return session().createQuery(hql).list();
    }

   public Company queryByMail(String mail){
        hql = "FROM Company a WHERE a.companyMail = ?";
        return (Company)session().createQuery(hql).setParameter(0,mail).uniqueResult();
    }


    public Company queryById(String id){
        hql = "FROM Company a WHERE a.companyId = ?";
        return (Company)session().createQuery(hql).setParameter(0,id).uniqueResult();
    }




}
