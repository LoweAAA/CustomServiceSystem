package com.givemefive.customerservicesystem.repostory.impl;


import com.givemefive.customerservicesystem.repostory.UserDao;
import com.givemefive.customerservicesystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class UserDaoimpl implements UserDao {
    private String hql;

    @Autowired
    private SessionFactory sessionFactory;
    private Session session(){
        return sessionFactory.getCurrentSession();
    }

    public void save(User user) {
        session().save(user);
    }

    public void delete(String id) {
        hql = "DELETE FROM User l WHERE l.id = ?";
        session().createQuery(hql).setParameter(0, id).executeUpdate();
    }

    public void update(User user) {
        session().update(user);
    }

    public List<User> getAll() {
        hql="FROM User ";
        return session().createQuery(hql).list();
    }

    public User queryBymail(String usermail) {
        hql = "FROM User l WHERE l.userMail = ?";
        return (User) session().createQuery(hql).setParameter(0, usermail).uniqueResult();
    }

}
