package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.bean.AskForLeave;
import com.givemefive.customerservicesystem.repostory.AskForLeaveDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class AflDaoImpl implements AskForLeaveDao{

    private String hql;

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }


    @Override
    public List<AskForLeave> getAll() {
        hql = "FROM AskForLeave ";
        return session().createQuery(hql).list();
    }

    @Override
    public void addAfl(AskForLeave askForLeave) {
        session().save(askForLeave);
    }

    @Override
    public List<AskForLeave> queryByName(String name) {
        hql = "FROM AskForLeave a WHERE a.csName = ?";
        return session().createQuery(hql).setParameter(0,name).list();
    }

    @Override
    public void update(AskForLeave askForLeave) {
        session().update(askForLeave);
    }


}
