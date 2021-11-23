
package com.company;

import java.sql.SQLOutput;

public class Client extends User implements SignUp {
    public Client(String userName, String email, String password, String mobileNumber) {
        super(userName, email, password, mobileNumber);
    }

    public void createRequestRide(Area a1, Area a2 ){}
    public void rateDriver(Driver d, double rate){
        d.rate.addRate(rate);
        d.rate.setRate(rate);
    }

    public void Register(){
        boolean check =false;
        for(int i=0;i<d.SuspUser.size();i++){
            if(d.SuspUser.get(i)==this.email){
                check=true;
            }
        }
        if(!check){
            d.ClientList.add((Client) this);
        }
        else{
            System.out.println("This Email is Suspended :(");
        }
    }

    public boolean logIn() {
        boolean flag = false;
        for(int i=0; i< d.ClientList.size() ;i++)
        {
            if(this.email.equals(d.ClientList.get(i).email))
                flag = true;
        }
        return flag;

    }

    @Override
    public String toString() {
        return "Client{" +
                "userName='" + userName + '\n' +
                ", email='" + email + '\n' +
                ", mobileNumber='" + mobileNumber + '\n' +
                ", ID=" + ID +
                '}';
    }

}