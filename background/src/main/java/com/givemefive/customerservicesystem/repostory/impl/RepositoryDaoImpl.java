package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.Repository;
import com.givemefive.customerservicesystem.repostory.RepositoryDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@org.springframework.stereotype.Repository
@Transactional
public class RepositoryDaoImpl implements RepositoryDao {


    private String hql;

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addQuestion(Repository repository) {
        session().save(repository);
    }

    @Override
    public void delete(String id) {
        hql = "DELETE FROM Repository a WHERE a.repositoryId=?";
        session().createQuery(hql).setParameter(0,id).executeUpdate();
    }


    @Override
    public void update(Repository repository){
        session().update(repository);
    }


    @Override
    public Repository queryById(String id){
        hql = "FROM Repository a WHERE a.repositoryId = ?";
        return (Repository)session().createQuery(hql).setParameter(0,id).uniqueResult();
    }

    @Override
    public List<Repository> getAll() {
        hql = "FROM Repository";
        return session().createQuery(hql).list();
    }

    /*@Override
    public List<Repository> queryByCate(String cateName){
        hql = "FROM Repository a,Category b WHERE "
    }*/

}
