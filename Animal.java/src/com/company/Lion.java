package com.company;

public class Lion extends Animal {

    private String  lionType;

    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        lionType();

    }

    public void lionType() {
        if (getWeight() < 80) {

            lionType = "cub";
        } else if (getWeight() < 120) {

            lionType = "female";
        } else {

            lionType = "male";
        }
    }


    public void print(){

        System.out.println("num teeth = > " + getNumTeeth());
        System.out.println("weight    = > " + getWeight());
        System.out.println("spots     = > " + getSpots());
        System.out.println("lionType  = > " + lionType);
    }

}
