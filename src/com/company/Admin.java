package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Scanner;

public class Admin implements SignIn {
    protected String email;
    protected String password;
    DataBase d=new DataBase();
    protected ArrayList<RegistrationDriver> list;

    public Admin(String e,String p) {
        this.email=e;
        this.password=p;
        d.AdminList.add(this);
    }

    public void viweListRegDriver(){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<d.regDriversList.size();i++){
            System.out.println(d.regDriversList.get(i));
            System.out.println("Do you want to verify this Registration (Yes/NO)");
            String s=sc.next();
            if(s.equals("Yes")){
                d.regDriversList.get(i).changeStatus(true);
            }
        }
    };
    public void suspend(int id){
        for(int i=0;i<d.appDriver.size();i++){
            if(d.appDriver.get(i).ID==id){
                d.appDriver.remove(d.appDriver.get(i));
            }
        }
    };
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
