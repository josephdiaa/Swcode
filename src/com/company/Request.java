package uper.src.com.company;


import java.util.ArrayList;

public class Request {
    protected Area source;
    protected Area destination;
    protected Client client;
    protected Driver driver;
    protected ArrayList<Offer>listOffer;

    public Request( ){

    }
    public Request(Area a1, Area a2 , Client c ){

        this.source = a1;
        this.destination =a2;
        this.client  = c;

    }
    public ArrayList<Driver> notify2()
    {
        TripManager tm = new TripManager();
        return  tm.noftifyDrivers(this);
    }
    public void getOffers() {}
    public void makeOffer(Driver d,double price){
        this.driver = d;

    }

}