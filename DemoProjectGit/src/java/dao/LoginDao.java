/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;

/**
 *
 * @author Admin
 */
public interface LoginDao {
    public boolean checkLogin(User user);
}
