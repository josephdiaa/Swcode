package com.company;

public class Client extends User implements SignUp {
    public Client(String userName, String email, String password, String mobileNumber) {
        super(userName, email, password, mobileNumber);
    }

    public void createRequestRide(Area a1, Area a2 ){}
    public void rateDriver(Driver d, int rate){}
    public void Register(){
        d.ClientList.add((Client) this);
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
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", ID=" + ID +
                '}';
    }

}
