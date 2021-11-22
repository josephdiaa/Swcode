
package com.company;

abstract class User implements SignIn ,SignUp {
    static DataBase d = new DataBase();
    protected String userName;
    public String email;
    protected String password;
    protected String mobileNumber;
    protected long ID;
    protected static long count = 0;

    public User(String userName, String email, String password, String mobileNumber) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
        count++;
        this.ID = count;
    }


}
