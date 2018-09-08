/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import dao.impl.LoginDaoImpl;
import entity.User;
import service.LoginServices;

/**
 *
 * @author Admin
 */
public class LoginServicesImpl implements LoginServices{
    private static LoginServicesImpl instance = new LoginServicesImpl();
    
    public static LoginServicesImpl getInstance()
    {
        return instance;
    }
    @Override
    public boolean checkLogin(User a) {
        return LoginDaoImpl.getInstance().checkLogin(a);
    }
    
}
