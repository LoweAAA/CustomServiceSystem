package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.bean.SystemQuestion;
import com.givemefive.customerservicesystem.repostory.SystemQuesDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class SystemQuesDaoImpl implements SystemQuesDao {

    private String hql;

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addQues(SystemQuestion systemQuestion) {
        session().save(systemQuestion);
    }

    @Override
    public List<SystemQuestion> getAll() {
        hql = "FROM SystemQuestion ";
        return session().createQuery(hql).list();
    }
}
