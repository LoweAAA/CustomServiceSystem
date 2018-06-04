package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.Category;
import com.givemefive.customerservicesystem.repostory.CategoryDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    private String hql;

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }


    public List<Category> getAll(){
        hql="FROM Category";
        return session().createQuery(hql).list();
    }


    @Override
    public List<Category> queryByCom(String comname) {
        hql = "FROM Category a WHERE a.companyName=?";
        return session().createQuery(hql).setParameter(0, comname).list();
    }
}
