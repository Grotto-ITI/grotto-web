/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grotto.grotto.service.transaction.Impl;

import com.grotto.grotto.model.home.AbstractDaoInt;
import com.grotto.grotto.service.transaction.Interfaces.TransactionInt;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dina
 * @param <T>
 * @param <PK>
 */
@Service
public class TransactionImp<T, PK extends Serializable>implements TransactionInt<T, PK>{
  @Autowired  
  private AbstractDaoInt<T,PK> dao;

    public AbstractDaoInt<T, PK> getDao() {
        return dao;
    }

    public void setDao(AbstractDaoInt<T, PK> dao) {
        this.dao = dao;
    }

   

    @Override
    public void create(T obj) {
        dao.beginTransaction();
        dao.persist(obj);
        dao.commmitTransaction();
    }

    @Override
    public T read(PK id) {
        T data;
        dao.beginTransaction();
        data = dao.read(id);
        dao.commmitTransaction();
        return data;
    }

    @Override
    public List<T> readAll(T obj) {
        List data;
        dao.beginTransaction();
        data = dao.readAll(obj);
        dao.commmitTransaction();
        return data;
    }

    @Override
    public void saveOrUpdate(T obj) {
        dao.beginTransaction();
        dao.persist(obj);
        dao.commmitTransaction();
    }

    @Override
    public void delete(PK id) {
        dao.beginTransaction();
        dao.delete(id);
        dao.commmitTransaction();
    }

}
