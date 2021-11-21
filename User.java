/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author mina
 */
 abstract class User {
    String userName;
    String email;
    String password;
    String mobileNumber;
    long ID;
    static long  count =0;

    public User(String userName, String email, String password , String mobileNumber, int id) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.ID = count;
        count++;
    }
    
    
}
