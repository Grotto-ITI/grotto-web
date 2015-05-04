/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grotto.grotto.service.transaction.Interfaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dina
 * @param <T>
 * @param <PK>
 */
public interface TransactionInt<T, PK extends Serializable>{
    
    public void create(T obj);

    public T read(PK id);

    public List<T> readAll(T obj);

    public void saveOrUpdate(T obj);

    public void delete(PK id);
    
}
