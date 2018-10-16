package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.bean.Admin;
import com.givemefive.customerservicesystem.repostory.AdminDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class AdminDaoImpl implements AdminDao {

    private String hql = "";

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Admin queryByMail(String mail) {
        hql = "FROM Admin a WHERE a.adminMail = ?";
        return (Admin)session().createQuery(hql).setParameter(0, mail).uniqueResult();
    }
}
