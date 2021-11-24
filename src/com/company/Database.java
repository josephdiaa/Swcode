package com.company;

import java.util.ArrayList;

class DataBase {
    static ArrayList<Client> ClientList = new ArrayList<Client>();
    static ArrayList<Driver> DriverList = new ArrayList<Driver>();
    static ArrayList<Admin> AdminList = new ArrayList<Admin>();
    static ArrayList<RegistrationDriver>regDriversList=new ArrayList<RegistrationDriver>();
    static ArrayList<Driver> penDriver=new ArrayList<Driver>();
    static ArrayList<String> SuspUser=new ArrayList<String>();


    void update() {
    }

    void delete() {
    }

    void set() {
    }

    public ArrayList<Driver> get() {

        return DriverList;
    }
}

