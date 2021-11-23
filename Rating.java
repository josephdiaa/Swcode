/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uper;

import java.util.ArrayList;

/**
 *
 * @author mina
 */
class Rating {
    ArrayList<Rating> arr = new ArrayList<>();
    private double rate;
    private double avgRate;

    public Rating(double rate) {
        this.rate = rate;
    }
    public Rating() {
    }
    public void addRate(double rate)
    {
        if(rate<1 && rate>5)
            System.out.println("INVALID RATE");
        else
        {
            arr.add(new Rating(rate));
            updateRating();
        }
    }


    public void setArr(ArrayList<Rating> arr) {
        this.arr = arr;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setAvgRate(double avgRate) {
        this.avgRate = avgRate;
    }

    public ArrayList<Rating> getArr() {
        return arr;
    }

    public double getRate() {
        return rate;
    }
    public double getAvgRate() {
        return avgRate;
    }

    void updateRating(){
        double sum =0;
        for(Rating r : this.arr)
        {
            sum+= r.getRate();
        }
        this.setAvgRate(sum/this.arr.size());
    }
    void showAvgRate(){
        System.out.println("Driver's Average Rate is : " + this.getAvgRate());
    }
    void viewRatingsList()
    {
        System.out.println("All Ratings :");
        for(Rating r : this.arr)
        {
            System.out.println(r.getRate());
        }

    }
}
