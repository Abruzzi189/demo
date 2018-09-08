/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.User;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@ManagedBean
@SessionScoped
public class loginBean {

    private User user;    

    @PostConstruct
    public void init()
    {
        user = new User();
    }
    public void checkLogin() {
        String url = "";
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("www.w3school.com");
        } catch (IOException ex) {
            Logger.getLogger("checkLogin").log(Level.SEVERE, null, ex);
        }
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
  

}
