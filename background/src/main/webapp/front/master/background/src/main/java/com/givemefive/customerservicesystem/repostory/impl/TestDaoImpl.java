package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.Record;
import com.givemefive.customerservicesystem.model.Test;
import com.givemefive.customerservicesystem.repostory.TestDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TestDaoImpl implements TestDao{

    @Autowired
    private SessionFactory sessionFactory;

    private String hql;

    private Session session(){
        return sessionFactory.getCurrentSession();
    }

    public List<Test> getAll() {
        hql="FROM Test";
        return session().createQuery(hql).list();
    }

    public void save(Test test) {

    }

    public void update(Test test) {

    }

    public void detele(Test test) {

    }
}
