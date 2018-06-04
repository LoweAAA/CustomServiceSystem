package com.givemefive.customerservicesystem.repostory.impl;

import com.givemefive.customerservicesystem.model.ProductQuestion;
import com.givemefive.customerservicesystem.repostory.ProdQuesDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class ProdQuesDaoImpl implements ProdQuesDao {


    private String hql;

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }


    @Override
    public List<ProductQuestion> getAll() {
        hql = "FROM ProductQuestion ";
        return session().createQuery(hql).list();
    }

    @Override
    public void addQues(ProductQuestion productQuestion) {
        session().save(productQuestion);
    }

    @Override
    public void updateQues(ProductQuestion productQuestion) {
        session().update(productQuestion);
    }
}
