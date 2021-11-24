/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uper;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Objects;

public class TripManager extends Database{
    public void noftifyDrivers(Request cr){
       Database d=new Database();
        for (int i=0; i<d.DriverList.size(); i++){
            for(int j=0; j<d.DriverList.get(i).favArea.size(); j++){
                if(d.DriverList.get(i).favArea.get(j).getName().equalsIgnoreCase(cr.source.getName())){
                    d.DriverList.get(i).Reqs.add(cr);
                    break;
                }
            }
        }
    }
}