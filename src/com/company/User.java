
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

    public static DataBase getD() {
        return d;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public long getID() {
        return ID;
    }

    public static long getCount() {
        return count;
    }

    public static void setD(DataBase d) {
        User.d = d;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public static void setCount(long count) {
        User.count = count;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", ID=" + ID +
                '}';
    }
}
