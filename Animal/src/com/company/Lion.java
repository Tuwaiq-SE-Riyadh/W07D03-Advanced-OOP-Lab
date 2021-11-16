package com.company;

public class Lion extends Animal{

    String type;

    public Lion(int numTeeth, boolean spots, int weight){
        super(numTeeth, spots, weight);
    }

    public void setType(){
        if(getWeight() < 80){
            this.type = "Cup";
        }
        else if(getWeight() < 120){
            this.type = "Female";
        }
        else{
            if(getWeight()>120) {
                this.type = "Male";
            }
        }
    }
    public String getType(){ return type; }

    public void print(){
        System.out.println("Type: "+type);
    }
}
