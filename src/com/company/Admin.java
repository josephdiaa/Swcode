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
        }
        while(true){
            System.out.println("Please Enter Driver ID You want to verify ");
            int s=sc.nextInt();
            verify(s);
            System.out.println("Do You want to Continue ? (Yes/No)");
            String st=sc.next();
            if(st.equalsIgnoreCase("yes")){
                continue;
            }
            else if(st.equalsIgnoreCase("No")){
                System.out.println("Thank You For verify");
                break;
            }
            else{
                System.out.println("Wrong Input");
            }
        }
    };
    public void verify(int id){
        for(int i=0;i<d.regDriversList.size();i++){
            if(d.regDriversList.get(i).driver.ID==id){
                d.regDriversList.get(i).changeStatus(true);
                break;
            }
        }
    }
    public void suspend(int id){
        for(int i=0;i<d.DriverList.size();i++){
            if(d.DriverList.get(i).ID==id){
                d.SuspUser.add(d.DriverList.get(i).email);
                d.DriverList.remove(d.DriverList.get(i));
            }
            if(d.ClientList.get(i).ID==id){
                d.SuspUser.add(d.ClientList.get(i).email);
                d.ClientList.remove(d.ClientList.get(i));
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
