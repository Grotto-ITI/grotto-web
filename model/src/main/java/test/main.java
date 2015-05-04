/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.grotto.grotto.model.home.AbstractDaoInt;
import com.grotto.grotto.model.home.UserHomeInt;
import com.grotto.grotto.model.home.pojo.Users;
import com.grotto.grotto.model.homeImpl.AbstractDaoImp;
import com.grotto.grotto.model.homeImpl.UserHomeImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dina
 */
public class main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("newSpringXMLConfig.xml");

        UserHomeInt my = (UserHomeInt) context.getBean(UserHomeImp.class);

        Users user = new Users();
        user.setUserName("ttttttt");
        user.setFirstName("ttttttt");
        user.setMobileNumber("5555555");
        my.beginTransaction();
        my.persist(user);
        my.commmitTransaction();
        System.out.print("data inserted");

    }
}
