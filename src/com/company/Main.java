package com.company;

public class Main {

    public static void main(String[] args) {
	    User c =new Client("mias", "cndvs@" , " 3278", "01555");
        c.Register();
        DataBase b = new DataBase();
        System.out.println(c.logIn());
        System.out.println(b.ClientList.get(0));
    }
}
