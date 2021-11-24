/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uper;
import java.util.ArrayList;
import java.util.*;
public class Area {
    String name;
    public Area(String area){
        this.name = area;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}