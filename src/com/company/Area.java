
package com.company;
import java.util.ArrayList;
import java.util.*;
/**
 * @Class Area
 * @author Abanoub
 */
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