package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class Admin extends User {
    protected ArrayList<RegistrationDriver> list;

    public Admin(String userName, String email, String password, String mobileNumber) {
        super(userName, email, password, mobileNumber);
    }

    public void viweList(){};
    public void verfiy(String nationalId){};
    public void suspend(int id){};
    public boolean logIn() {
        boolean flag = false;
        for(int i=0; i< d.AdminList.size() ;i++)
        {
            if(this.email.equals(d.AdminList.get(i).email))
                flag = true;
        }
        return flag;
    }

}
