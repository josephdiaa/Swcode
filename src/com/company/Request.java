/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uper;

import java.util.ArrayList;

public class Request {
    protected Area source;
    protected Area destination;
    protected Client client;
    protected Driver driver;
    protected ArrayList<Offer>listOffer=new ArrayList<Offer>();

    public Request( ){

    }
    public Request(Area a1, Area a2 , Client c ){
        this.source = a1;
        this.destination =a2;
        this.client  = c;
        notify2();
    }

    public void notify2() {
        TripManager tm = new TripManager();
        tm.noftifyDrivers(this);
    }
    public void getOffers() {}

    @Override
    public String toString() {
        return "Request:" +'\n'+
                "   source=" + source +'\n'+
                "   destination=" + destination +'\n'+
                client +'\n';
    }
}