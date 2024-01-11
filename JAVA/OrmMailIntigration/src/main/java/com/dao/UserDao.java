package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

import java.util.List;

@Repository
public class UserDao {

    private SessionFactory sessionFactory;

    @Autowired
    public UserDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void insert(User u) {
        getCurrentSession().save(u);
    }

    public User getByEmailAndPassword(String email, String password) {
        String hql = "FROM User WHERE email=:email AND password=:password";
        List<User> users = getCurrentSession().createQuery(hql, User.class)
                .setParameter("email", email)
                .setParameter("password", password)
                .getResultList();

        return users.isEmpty() ? null : users.get(0);
    }

    @Transactional
    public void update(User u) {
        getCurrentSession().update(u);
    }

    public User findById(int id) {
        return getCurrentSession().find(User.class, id);
    }

    @Transactional
    public void delete(int id) {
        getCurrentSession().delete(findById(id));
    }

    public User getByEmail(String email) {
        String hql = "FROM User WHERE email=:email";
        List<User> users = getCurrentSession().createQuery(hql, User.class)
                .setParameter("email", email)
                .getResultList();

        return users.isEmpty() ? null : users.get(0);
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
