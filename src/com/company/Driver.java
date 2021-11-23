/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uper.src.com.company;

import java.util.ArrayList;

public class Driver extends User {
    protected String driverLicense;
    protected boolean driverStatus;
    protected String nationalId;
    protected ArrayList<Area> favArea;
    protected double minCost = 30.0;
    protected double maxCost = 150.0;
    Rating rate = new Rating();


    public Driver(String userName, String email, String password, String mobileNumber,String NationalId,String DriverLicense) {
        super(userName, email, password, mobileNumber);
        this.nationalId=NationalId;
        this.driverLicense=DriverLicense;
        this.driverStatus=false;
        RegistrationDriver r=new RegistrationDriver(this,false);
        d.regDriversList.add(r);
        d.penDriver.add(this);
    }
    public void addFavArea(Area area){
        favArea.add(area);
    }
    public void setPrice(){
        double range = maxCost - minCost +1;
        double price = (double) (Math.random()*range) + minCost;
    }
    public void changeDriverStatus(boolean c){
        this.driverStatus=c;
        if(c){
            d.DriverList.add(this);
            d.penDriver.remove(this);
        }
    }

    public boolean checkId(String nationalId){
        return this.nationalId.equals(nationalId);
    }



    public void notification(){


    }

    public void showRates(){
        this.rate.viewRatingsList();
    }
    public void Register(){
        boolean check =false;
        for(int i=0;i<d.SuspUser.size();i++){
            if(d.SuspUser.get(i)==this.email){
                check=true;
            }
        }
        if(!check){
            d.DriverList.add((Driver) this);
        }
        else{
            System.out.println("This Email is Suspended :(");
        }
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
        return "Driver:" +'\n'+
                "   userName=" + userName + '\n' +
                "   email=" + email + '\n' +
                "   mobileNumber=" + mobileNumber + '\n' +
                "   ID=" + ID +'\n'+
                "   driverLicense=" + driverLicense + '\n' +
                "   driverStatus=" + driverStatus +'\n'+
                "   nationalId=" + nationalId + '\n' +
                "   favArea=" + favArea +'\n'+
                rate +'\n'+
                '}'+'\n';
    }
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
}