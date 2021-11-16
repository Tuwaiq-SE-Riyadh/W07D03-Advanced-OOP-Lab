package com.company;

public class Lion extends Animal{
    public String type;


    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth,spots,weight);
        setType();
    }

    public  void  setType(){
        if(getWeight() < 80){
            this.type = "cub";
        }
        else if(getWeight() < 120){
            this.type = "female";
        }
        else {
            this.type = "male";
        }
    }

    @Override
    public String toString() {
        return "Lion{" +
                "type='" + type + '\'' +
                "numTeeth='" + getNumTeeth() + '\'' +
                "spots='" + getSpots() + '\'' +
                "weight='" + getWeight() + '\'' +'}';
    }
}
