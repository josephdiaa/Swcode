package com.company;

public class RegistrationDriver {
    protected boolean status;
    Driver driver;

    public RegistrationDriver( Driver driver,boolean status) {
        this.status = status;
        this.driver = driver;
    }

    public void changeStatus(boolean check){
        this.status=check;
        if(check){
            driver.changeDriverStatus(true);
        }
    }
    @Override
    public String toString() {
        return "RegistrationDriver{" +'\n'+
                "status=" + status +'\n'+
                driver ;
    }
}
