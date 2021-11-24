
package com.company;

import java.util.Scanner;
/**
 * @Class Client
 * @author Renad
 */
public class Client extends User implements SignUp {
    private Request request=new Request();

    /**
     * CLient's constructor that takes all data
     * @param userName Client's  username
     * @param email Client's email
     * @param password Client's password
     * @param mobileNumber Client's mobile number
     */
    public Client(String userName, String email, String password, String mobileNumber) {
        super(userName, email, password, mobileNumber);
    }

    public Client(String email, String password) {
        super(email, password);
    }


    public void requestRide(String source, String destination) {
        Area src = new Area(source);
        Area dest = new Area(destination);
        request = new Request(src, dest, this);
    }

    public void rateDriver(Driver d, double rate) {
        d.rate.addRate(rate);
        d.rate.setRate(rate);
    }

    public Boolean Register() {
        boolean check = false;
        for (int i = 0; i < d.SuspUser.size(); i++) {
            if (d.SuspUser.get(i) == this.email) {
                check = true;
            }
        }
        if (!check) {
            d.getClientList().add((Client) this);
            return true;
        } else {
            return false;
        }
    }

    public int logIn() {
        boolean check = true;
        for (int i = 0; i < d.SuspUser.size(); i++) {
            if (d.SuspUser.get(i) == this.email) {
                check = false;
            }
        }
        boolean flag = false;
        for (int i = 0; i < d.getClientList().size(); i++) {
            if (this.email.equals(d.getClientList().get(i).email) && this.password.equals(d.getClientList().get(i).password))
                flag = true;
        }
        if (check == false && flag == false) {
            return 1;
        } else if (check == true && flag == true) {
            return 2;
        } else {
            return 3;
        }
    }

    public void ViewOffer() throws NullPointerException {
        if(request.listOffer.size()>=1){
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < request.listOffer.size(); i++) {
                System.out.println("Number of offer: " + (i + 1));
                System.out.println(request.listOffer.get(i));
            }
            System.out.println("Enter Number of Offer to accept");
            int n = sc.nextInt();
            request.listOffer.get(n - 1).accept = true;
            System.out.println("Do you want to set Rate ?(Yes/No)");
            String s = sc.next();
            if (s.equalsIgnoreCase("Yes")) {
                System.out.println("Enter the rate");
                double rate = sc.nextDouble();
                this.rateDriver(request.listOffer.get(n - 1).driver, rate);
            }
            request.listOffer.clear();
        }
        else{
            System.out.println("No Offer now :(");
        }
    }

    public void rateAnyDriver() throws IndexOutOfBoundsException {
        try {
            Database d = new Database();
            for (int i = 0; i < d.getDriverList().size(); i++) {
                System.out.println("Driver " + (i + 1));
                System.out.println(d.getDriverList().get(i));
            }
            System.out.println(d.getDriverList().size());
            if (d.getDriverList().size() == 0) {
                System.out.println("No drivers available");
                return;
            } else {
                System.out.println("Do you want to rate any Driver ?(yes/no)");
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                if ("yes".equalsIgnoreCase(s)) {
                    System.out.println("Choose the Driver number.");
                    int id = sc.nextInt();
                    System.out.println("Enter the rate");
                    double r = sc.nextDouble();
                    this.rateDriver(d.getDriverList().get(id - 1), r);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No drivers available");
        }

    }

    public void clientInterface() {
        while (true) {
            System.out.println("Client's List");
            System.out.println("press 1 to request new ride.");
            System.out.println("press 2 to list all offers.");
            System.out.println("press 3 to rate Drivers.");
            System.out.println("press 4 to exit");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 1 -> {
                    System.out.println("Enter the source.");
                    String src = sc.next();
                    System.out.println("Enter the destination");
                    String dest = sc.next();
                    this.requestRide(src, dest);
                }
                case 2 -> this.ViewOffer();
                case 3 -> this.rateAnyDriver();
                case 4 -> {
                    break;
                }

            }
            if (x == 4)
                break;
        }
    }

    @Override
    public String toString() {
        return "Client:" + '\n' +
                "   userName=" + userName + '\n' +
                "   email=" + email + '\n' +
                "   mobileNumber=" + mobileNumber + '\n' +
                "   ID=" + ID + '\n' +
                '}' + '\n';
    }

}