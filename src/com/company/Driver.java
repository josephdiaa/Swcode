package com.company;

import java.util.ArrayList;

public class Driver extends User {
    protected String driverLicense;
    protected String nationalId;
    protected ArrayList<Area> favArea;
    protected Rating rate;
    protected double avgUserRate;

    public Driver(String userName, String email, String password, String mobileNumber) {
        super(userName, email, password, mobileNumber);
    }

    public void createRegistration(Driver driver){// initializing driver
        this.avgUserRate=driver.avgUserRate;
        this.driverLicense=driver.driverLicense;
        this.favArea=driver.favArea;
        this.nationalId=driver.nationalId;
        this.rate=driver.rate;
    }
    
    public boolean checkRegistration(){
        return false;
       
    }
    
    public boolean checkId(String nationalId){
        return this.nationalId.equals(nationalId);
    }
    
    public void addFavArea(Area area){
        
    }
    
    public void notification(){
        
        
    }
    
    public void showRates(){
        
    }
    public void Register(){
        //c=new Client(userName,email,password,mobileNumber);
        d.DriverList.add((Driver) this);

    }
    public boolean logIn() {
        boolean flag = false;
        for(int i=0; i< d.DriverList.size() ;i++)
        {
            if(this.email.equals(d.DriverList.get(i).email))
                flag = true;
        }
        return flag;

    }


}
