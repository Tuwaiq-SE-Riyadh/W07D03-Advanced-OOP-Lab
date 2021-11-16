package com.company;

import java.util.Arrays;

public class Cheetah extends Animal{
   private String [] type;


    public Cheetah(int numTeeth, boolean spots, int weight, String [] type) {
        super(numTeeth, spots, weight);
        this.type = type;
    }

    public String getType() {
        return Arrays.toString(type);
    }

    public void setType(String [] type) {
        this.type = type;
    }


    public String toString() {
        return "Cheetah number of teeth { "+getNumTeeth()+"}" +
                " spots {"+getSpots()+"}" +
                " Weight {"+getWeight()+"}" +
                " type {" + Arrays.toString(type)+
                '}';
    }
}
