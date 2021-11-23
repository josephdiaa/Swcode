package uper.src.com.company;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        User c =new Driver("mias", "cndvs@" , " 3278", "01555","20190155","159");
        c.Register();
        DataBase d=new DataBase();
        Admin a=new Admin("joseph.diaa@gmail.com","159357");
        a.logIn();
        a.viweListRegDriver();
        System.out.println(d.DriverList.get(0));
    }
}
