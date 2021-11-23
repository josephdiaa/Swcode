
package com.company;

import java.util.ArrayList;

class Rating {
    ArrayList<Double> arr = new ArrayList<>();
    private double rate;
    private double avgRate;

    public Rating(double rate) {
        this.rate = rate;
    }
    public Rating() {}
    public void addRate(double rate) {
        if(rate<1 && rate>5)
            System.out.println("INVALID RATE");
        else
        {
            arr.add(rate);
            updateRating();
        }
    }

    public void setArr(ArrayList<Double> arr) {
        this.arr = arr;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setAvgRate(double avgRate) {
        this.avgRate = avgRate;
    }

    public ArrayList<Double> getArr() {
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
        for(double r : this.arr)
        {
            sum+= r;
        }
        this.setAvgRate(sum/this.arr.size());
    }
    void showAvgRate(){
        System.out.println("Driver's Average Rate is : " + this.getAvgRate());
    }
    void viewRatingsList() {
        System.out.println("All Ratings :");
        for(double r : this.arr)
        {
            System.out.println(r);
        }

    }

    @Override
    public String toString() {
        return "   avgRate=" + avgRate;
    }
}
