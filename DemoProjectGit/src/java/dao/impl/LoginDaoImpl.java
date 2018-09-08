/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.LoginDao;
import entity.User;
import sun.security.jca.GetInstance;

/**
 *
 * @author Admin
 */
public class LoginDaoImpl implements LoginDao {

    private static LoginDaoImpl instance = new LoginDaoImpl();

    public static LoginDaoImpl getInstance() {

        return instance;

    }

    @Override
    public boolean checkLogin(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
