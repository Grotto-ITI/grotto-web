/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grotto.grotto.model.homeImpl;

import com.grotto.grotto.model.home.AbstractDaoInt;
import com.grotto.grotto.model.home.UserHomeInt;
import com.grotto.grotto.model.home.pojo.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mostafa_ITI
 */
@Transactional(readOnly = false)
@Repository
public class UserHomeImp extends AbstractDaoImp<Users, Integer> implements AbstractDaoInt<Users, Integer>, UserHomeInt {

    public UserHomeImp() {
        super(Users.class);
    }

}
