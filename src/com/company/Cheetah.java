package com.company;

import java.util.Arrays;

public class Cheetah extends Animal{
    static String[] type;



    public Cheetah(int numTeeth, boolean spots, int weight,String[] type) {
        super(numTeeth, spots, weight);
        this.type =type;

    }

    public void  setType(String[] type){
        for (int i = 0; i <type.length ; i++) {
            this.type[i] =type[i] ;
        }

    }

    public String[] getType(){
        return type;
    }

    public String toString() {
        String output ="The Animal is Cheetah, Number Of Teeth is "+getNumTeeth()+", is it spots "+getSpots()+", it is weight is "+ getWeight()+ " types of cheetah "+ Arrays.toString(type);
        return output;
    }
}

