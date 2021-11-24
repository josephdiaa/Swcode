/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uper.src.com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver extends User {

    protected String driverLicense;
    protected boolean driverStatus;
    protected String nationalId;
    protected ArrayList<Area> favArea = new ArrayList<Area>();
    protected double minCost = 30.0;
    protected double maxCost = 150.0;
    Rating rate = new Rating();
    protected ArrayList<Request> Reqs = new ArrayList<Request>();

    public Driver(String userName, String email, String password, String mobileNumber, String NationalId, String DriverLicense) {
        super(userName, email, password, mobileNumber);
        this.nationalId = NationalId;
        this.driverLicense = DriverLicense;
        this.driverStatus = false;
        RegistrationDriver r = new RegistrationDriver(this, false);
        d.regDriversList.add(r);

    }

    public Driver(String email, String password) {
        super(email, password);
    }

    public void addFavArea(Area area) {
        favArea.add(area);
    }

    public void setPrice() {
        double range = maxCost - minCost + 1;
        double price = (double) (Math.random() * range) + minCost;
    }

    public void changeDriverStatus(boolean c) {
        this.driverStatus = c;
        if (c) {
            d.DriverList.add(this);
            d.penDriver.remove(this);
        }
    }

    public boolean checkId(String nationalId) {
        return this.nationalId.equals(nationalId);
    }
    public void viewAllRides(){
        for (int i = 0; i < this.Reqs.size(); i++) {
            System.out.println(this.Reqs.get(i));
        }
    }
    public void notification() {
        Scanner sc = new Scanner(System.in);
        System.out.println(Reqs.size());
        for (int i = 0; i < Reqs.size(); i++) {
            System.out.println(Reqs.get(i));
        }
        while (Reqs.size() >= 1) {
            System.out.println("Please Enter Client ID and price,If You want to Make offer");
            int s = sc.nextInt();
            int p = sc.nextInt();
            DriverOffer(s, p);
            System.out.println("Do You want to Continue ? (Yes/No)");
            String st = sc.next();
            if (st.equalsIgnoreCase("yes")) {
                continue;
            } else if (st.equalsIgnoreCase("No")) {
                System.out.println("Thank You For Your Offer");
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
        if (Reqs.size() == 0) {
            System.out.println("This is Last Request Good Bye :)");
        }
    }

    public void DriverInterface() {
        Scanner in = new Scanner(System.in);
        int input = 0;
        while (input != 4) {
            System.out.println("1- Add new Favourite area.");
            System.out.println("2- show ratings of your clients.");
            System.out.println("3- show all rides.");
            System.out.println("4- exit");
            input = in.nextInt();
            switch (input) {
                case 1 -> {
                    String ar;
                    System.out.println("Enter the name of area you want to add");
                    ar = in.next();
                    this.addFavArea(new Area(ar));
                }
                case 2 -> this.showRates();
                case 3 -> {
                  this.viewAllRides();
                }
                case 4 -> {
                    break;
                }
            }
        }
    }

    public void DriverOffer(int id, double price) {
        Offer off = new Offer();
        off.makeOffer(price, this);
        for (int i = 0; i < Reqs.size(); i++) {
            if (Reqs.get(i).client.ID == id) {
                Reqs.get(i).listOffer.add(off);
                Reqs.remove(Reqs.get(i));
            }
        }
    }

    public void showRates() {
        this.rate.viewRatingsList();
    }

    public Boolean Register() {
        boolean check = false;
        for (int i = 0; i < d.SuspUser.size(); i++) {
            if (d.SuspUser.get(i) == this.email) {
                check = true;
            }
        }
        if (!check) {
            d.penDriver.add(this);
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
        for (int i = 0; i < d.DriverList.size(); i++) {
            if (this.email.equals(d.DriverList.get(i).email) && this.password.equals(d.DriverList.get(i).password)) {

                this.ID = d.DriverList.get(i).ID;
                this.Reqs = d.DriverList.get(i).Reqs;
                this.driverLicense = d.DriverList.get(i).driverLicense;
                this.driverStatus = d.DriverList.get(i).driverStatus;
                this.email = d.DriverList.get(i).email;
                this.favArea = d.DriverList.get(i).favArea;
                this.maxCost = d.DriverList.get(i).maxCost;
                this.minCost = d.DriverList.get(i).minCost;
                this.mobileNumber = d.DriverList.get(i).mobileNumber;
                this.nationalId = d.DriverList.get(i).nationalId;
                this.password = d.DriverList.get(i).password;
                this.rate = d.DriverList.get(i).rate;
                this.userName = d.DriverList.get(i).userName;
                flag = true;
            }
        }
        if (check == false && flag == false) {
            return 1;
        } else if (check == true && flag == true) {

            return 2;
        } else {
            return 3;
        }

    }

    @Override
    public String toString() {
        return "Driver:" + '\n'
                + "   userName=" + userName + '\n'
                + "   email=" + email + '\n'
                + "   mobileNumber=" + mobileNumber + '\n'
                + "   ID=" + ID + '\n'
                + "   driverLicense=" + driverLicense + '\n'
                + "   driverStatus=" + driverStatus + '\n'
                + "   nationalId=" + nationalId + '\n'
                + "   favArea=" + favArea + '\n'
                + "   AvgRate=" + rate.getAvgRate() + '\n'
                + '}' + '\n';
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