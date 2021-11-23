package uper.src.com.company;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Objects;

public class TripManager extends DataBase{
    protected Request request;

    public ArrayList<Driver> noftifyDrivers(Request cr){
        ArrayList<Driver>ans=new ArrayList();
        request=new Request();
        request=cr;
        ArrayList <Driver> dr = new ArrayList();
        dr = get();    // DriverList in database

        for (int i=0; i<dr.size(); i++){

            for(int j=0; j<dr.get(i).favArea.size(); j++){

                if(dr.get(i).favArea.get(j).getName().equals( request.source.getName())){

                    ans.add( dr.get(i));

                }
            }
        }
        return  ans;
    }

    public void getOffer(Offer of){}
    public void getClientResponse(){}
    public void createTrip(){}
}