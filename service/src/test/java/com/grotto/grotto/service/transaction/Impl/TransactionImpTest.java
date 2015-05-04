/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.grotto.grotto.service.transaction.Impl;

import com.grotto.grotto.model.home.AbstractDaoInt;
import java.io.Serializable;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dina
 */
public class TransactionImpTest {
    
    public TransactionImpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDao method, of class TransactionImp.
     */
    @org.junit.Test
    public void testGetDao() {
        System.out.println("getDao");
        TransactionImp instance = new TransactionImp();
        AbstractDaoInt expResult = null;
        AbstractDaoInt result = instance.getDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDao method, of class TransactionImp.
     */
    @org.junit.Test
    public void testSetDao() {
        System.out.println("setDao");
        TransactionImp instance = new TransactionImp();
        instance.setDao(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class TransactionImp.
     */
    @org.junit.Test
    public void testCreate() {
        System.out.println("create");
        Object obj = null;
        TransactionImp instance = new TransactionImp();
        instance.create(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class TransactionImp.
     */
    @org.junit.Test
    public void testRead() {
        System.out.println("read");
        Object id = null;
        TransactionImp instance = new TransactionImp();
        Object expResult = null;
        Object result = instance.read((Serializable) id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class TransactionImp.
     */
    @org.junit.Test
    public void testReadAll() {
        System.out.println("readAll");
        Object obj = null;
        TransactionImp instance = new TransactionImp();
        List expResult = null;
        List result = instance.readAll(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrUpdate method, of class TransactionImp.
     */
    @org.junit.Test
    public void testSaveOrUpdate() {
        System.out.println("saveOrUpdate");
        Object obj = null;
        TransactionImp instance = new TransactionImp();
        instance.saveOrUpdate(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TransactionImp.
     */
    @org.junit.Test
    public void testDelete() {
        System.out.println("delete");
        Object id = null;
        TransactionImp instance = new TransactionImp();
        instance.delete((Serializable) id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
