/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grotto.grotto.service.transaction.Impl;

import com.grotto.grotto.model.home.pojo.Users;
import com.grotto.grotto.service.transaction.Interfaces.TransactionInt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author dina
 */
public class Main {
    
    public static void main(String[] args) {
        
         ApplicationContext ctx = 
   new AnnotationConfigApplicationContext("beans.xml");
   
   TransactionInt t;
        t = ctx.getBean(TransactionImp.class);
        Users u = new Users("dina","abdelbadea",20,"dina.abdelbadea2","dina.abdelbadea","1234","17 abdelmonem", "011230225", null, null, Integer.SIZE, null, null, null, null, null, null, null, null);
        
        t.create(u);
    }
}
