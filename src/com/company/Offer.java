/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uper;
public class Offer  {
    protected double price;
    protected Driver driver;
    protected boolean accept;
    public Offer(){
        accept=false;
    }
    public void makeOffer(double p,Driver d){
        this.price=p;
        this.driver=d;
    }

    @Override
    public String toString() {
        return "Offer:" +'\n'+
                "   price=" + price +'\n'+
                "Driver:"+'\n'+
                 "  Driver name="+ driver.userName +'\n'
                +"  Driver mobile ="+driver.mobileNumber+'\n'
                +"  Driver license="+driver.driverLicense+'\n'
                +"  Driver national ID ="+driver.nationalId+'\n'
                +"  Driver rate = "+driver.rate.getAvgRate();
    }

    public double getPrice() {
        return price;
    }

    public Driver getDriver() {
        return driver;
    }

    public boolean isAccept() {
        return accept;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }
}
