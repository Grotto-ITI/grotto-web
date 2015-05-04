/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.homeImpl;

import com.grotto.grotto.model.home.AbstractDaoInt;
import java.io.Serializable;
import java.util.List;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mostafa_ITI
 */
@Repository
@Transactional(readOnly = false)
public abstract class AbstractDaoImp<T, PK extends Serializable> implements AbstractDaoInt<T, PK> {

    private Class<T> classInstance;
    Session session;

    public AbstractDaoImp(Class<T> classInstance) {
        this.classInstance = classInstance;
    }
//    public void setClassInstance(Class<T> classInstance) {
//        this.classInstance = classInstance;
//    }

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

//    protected void startOperation() {
//        session = sessionFactory.openSession();
//     //   tx = session.beginTransaction();
//    }
    protected Session getSession() {
//        if (sessionFactory.getCurrentSession() == null) {
        return sessionFactory.openSession();//session pooling
//        } else {
//            return sessionFactory.getCurrentSession();
//        }
    }

    @Override
    public void beginTransaction() {
        getTransaction();
    }

    protected Transaction getTransaction() {
        return getSession().beginTransaction();
    }

    @Override
    public void commmitTransaction() {
        getTransaction().commit();
    }

    public void commmitTransaction(Transaction tx) {
        tx.commit();
    }

    @Override
    public void rollbackTransaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void persist(T obj) {
//        Transaction tx = getTransaction();
        getSession().persist(obj);

//        commmitTransaction(tx);
    }

    @Override
    public void delete(PK id) {
        T obj = null;
        obj = read(id);
        getSession().delete(obj);

    }

    @Override
    public T read(PK id) {
        T obj = null;

        obj = (T) getSession().load(classInstance, id);
        return obj;
    }

    @Override
    public List<T> readAll(T obj) {
        List objects = null;

        Query query = getSession().createQuery("from " + obj.getClass().getName());
        // Query query = session.createQuery(String.format("FROM %s", classInstance.getSimpleName())).list();
        objects = query.list();
        return objects;
    }

    @Override
    public void saveOrUpdate(T obj) {
        getSession().saveOrUpdate(obj);
    }

}
