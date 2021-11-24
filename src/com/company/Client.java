

package com.company;
import java.util.Scanner;

public class Client extends User implements SignUp {
    private Request request;
    public Client(String userName, String email, String password, String mobileNumber) {
        super(userName, email, password, mobileNumber);
    }

    public void requestRide(String source,String destination)
    {
        Area src=new Area(source);
        Area dest =new Area(destination);
        request=new Request(src,dest,this);
    }

    public void rateDriver(Driver d, double rate){
        d.rate.addRate(rate);
        d.rate.setRate(rate);
    }

    public Boolean Register(){
        boolean check =false;
        for(int i=0;i<d.SuspUser.size();i++){
            if(d.SuspUser.get(i)==this.email){
                check=true;
            }
        }
        if(!check){
            d.ClientList.add((Client) this);
            return true;
        }
        else{
            return false;
        }
    }

    public int logIn() {
        boolean check =true;
        for(int i=0;i<d.SuspUser.size();i++){
            if(d.SuspUser.get(i)==this.email){
                check=false;
            }
        }
        boolean flag = false;
        for(int i=0; i< d.ClientList.size() ;i++)
        {
            if(this.email.equals(d.ClientList.get(i).email))
                flag = true;
        }
        if(check==false&&flag==false){
            return 1;
        }
        else if(check==true&&flag==true){
            return 2;
        }
        else{
            return 3;
        }
    }
    public void ViewOffer(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<request.listOffer.size();i++){
            System.out.println("Number of offer: "+(i+1));
            System.out.println(request.listOffer.get(i));
        }
        System.out.println("Enter Number of Offer to accept");
        int n= sc.nextInt();
        request.listOffer.get(n-1).accept=true;
        request.listOffer.clear();
    }

    @Override
    public String toString() {
        return "Client:" +'\n'+
                "   userName=" + userName + '\n' +
                "   email=" + email + '\n' +
                "   mobileNumber=" + mobileNumber + '\n' +
                "   ID=" + ID +'\n'+
                '}'+'\n';
    }

}