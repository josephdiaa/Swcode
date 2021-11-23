/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uper;

import java.util.ArrayList;

public class Driver extends User {
    protected String driverLicense;
    protected boolean driverStatus;
    protected String nationalId;
    protected ArrayList<Area> favArea;
     Rating rate = new Rating();

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setDriverStatus(boolean driverStatus) {
        this.driverStatus = driverStatus;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setFavArea(ArrayList<Area> favArea) {
        this.favArea = favArea;
    }

    public void setRate(Rating rate) {
        this.rate = rate;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public boolean isDriverStatus() {
        return driverStatus;
    }

    public String getNationalId() {
        return nationalId;
    }

    public ArrayList<Area> getFavArea() {
        return favArea;
    }

    public Rating getRate() {
        return rate;
    }

    public Driver(String userName, String email, String password, String mobileNumber,String NationalId,String DriverLicense) {
        super(userName, email, password, mobileNumber);
        this.nationalId=NationalId;
        this.driverLicense=DriverLicense;
        this.driverStatus=false;
        RegistrationDriver r=new RegistrationDriver(this,false);
        d.regDriversList.add(r);
        d.penDriver.add(this);
    }

    public void changeDriverStatus(boolean c){
        this.driverStatus=c;
        if(c){
            d.appDriver.add(this);
            d.penDriver.remove(this);
        }
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

    @Override
    public String toString() {
        return "Driver{" +
                "driverLicense='" + driverLicense + '\'' +
                ", driverStatus=" + driverStatus +
                ", nationalId='" + nationalId + '\'' +
                ", favArea=" + favArea +
                ", rate=" + rate +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", ID=" + ID +
                '}';
    }
}