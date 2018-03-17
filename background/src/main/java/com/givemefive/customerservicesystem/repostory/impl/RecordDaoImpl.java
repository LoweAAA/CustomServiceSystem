package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.Record;
import com.givemefive.customerservicesystem.repostory.RecordDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RecordDaoImpl implements RecordDao{

    @Autowired
    private SessionFactory sessionFactory;

    private String hql;

    private Session session(){
        return sessionFactory.getCurrentSession();
    }

    public List<Record> getAll() {
        hql="FROM Record";
        return session().createQuery(hql).list();
    }

    public void save(Record record) {

    }

    public void update(Record record) {

    }

    public void detele(Record record) {

    }
}
