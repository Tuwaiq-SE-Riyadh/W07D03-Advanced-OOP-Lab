package com.company;

import java.util.Arrays;

public class Cheetah<name> extends Animal  {
    static String  name;
     int []array;
    public Cheetah(int numTeeth, boolean spots, int weight, int[] array) {
        super(numTeeth, spots, weight);
        this.setName();
        this.array=array;
    }
    public String getArray(){
        return Arrays.toString(this.array ) ;
    }

    public String getName(){
        return name;
    }

    public void setName() {
        name = "Cheetah";
    }
    public String toString() {
        String output = "Number of Teeth: " + this.getNumTeeth();
        output += "\nDoes it have spots?: " +this.getSpots();
        output += "\nHow much does it weigh: " +this.getWeight();
        output += "\n tha array: " + getArray();
        output += "\n tha static name: " + getName();
        return output;
    }

}
