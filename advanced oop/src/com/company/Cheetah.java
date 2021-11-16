package com.company;

import java.util.Arrays;

public class Cheetah extends Animal {
    static int leg=4;
    String[] type ;

    public  Cheetah (int numTeeth, boolean spots, int weight,String []type){
        super(numTeeth,spots,weight);

        this.type=type;


    }




    public static int getLeg() {
        return leg;
    }

    public static void setLeg(int leg) {
        Cheetah.leg = leg;
    }


    public String toString() {
        return "Cheetah{" +
                " "+getNumTeeth()+" "+getSpots()+"  "+getWeight()+" " + Arrays.toString(type) +" "+getLeg()+
                '}';
    }
}
