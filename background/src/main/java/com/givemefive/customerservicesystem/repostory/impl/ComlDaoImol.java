package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.Coml;
import com.givemefive.customerservicesystem.repostory.ComlDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional
public class ComlDaoImol implements ComlDao {

    private String hql;

    @Autowired
    private SessionFactory sessionFectory;
    private Session session(){
        return sessionFectory.getCurrentSession();
    }

    @Override
    public void addComl(Coml coml) {
            session().save(coml);
    }

    @Override
    public void update(Coml coml) {
                session().update(coml);
    }

    @Override
    public void delete(int id) {
                hql = "DELETE FROM Coml a WHERE a.comlId = ?";
                session().createQuery(hql).setParameter(0,id).executeUpdate();
    }

    @Override
    public List<Coml> queryByCom(String comName) {
        hql = "FROM Coml a WHERE a.companyName = ?";
        return session().createQuery(hql).setParameter(0,comName).list();
    }

    @Override
    public Coml queryById(int id){
        hql = "FROM Coml a WHERE a.comlId = ?";
        return (Coml)session().createQuery(hql).setParameter(0,id).uniqueResult();
    }

    @Override
    public List<Coml> getAll() {
        hql = "FROM Coml";
        return session().createQuery(hql).list();
    }


}
