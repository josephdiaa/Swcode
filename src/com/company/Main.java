package com.company;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        //User c =new Driver("bob", "bob@gmail.com" , " 3278", "01555","20190155","159");
        //c.Register();
        DataBase d=new DataBase();
        Admin a=new Admin("joseph.diaa@gmail.com","159357");
        System.out.println(a.logIn());
        Driver dr = new Driver("mina", "mina@gmail.com", "123", "011125", "2424345435","456866");
        dr.Register();
        a.viweListRegDriver();
        Area Dokki = new Area("Dokki");
        Area Zamalek = new Area("Zamalek");
        dr.favArea.add(Zamalek);
        dr.favArea.add(Dokki);
        Client cl = new Client("monda", "dbew@", "545", "01545");
        cl.requestRide("Dokki","Helwan");
        dr.notification();
        cl.ViewOffer();

    }
}
