package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.Mytable;
import com.givemefive.customerservicesystem.repostory.MytableDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MytableDaoImpl implements MytableDao{

    private String hql;

    @Autowired
    private SessionFactory sessionFactory;


    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }


    public List<Mytable> getall() {
        hql="FROM Mytable";
        return currentSession().createQuery(hql).list();
    }

    public void save(Mytable mytable) {
        currentSession().save(mytable);
    }


}
