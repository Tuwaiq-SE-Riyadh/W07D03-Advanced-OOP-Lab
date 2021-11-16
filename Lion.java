package com.company;

public class Lion extends Animal {
    String type;
    public Lion (int numTeeth,boolean spots,int weight,String type){
        super(numTeeth,spots,weight);
        this.type=type;
    }

    public void setLionType(){

        if(getWeight()<80){
            type="cub";
            System.out.println("type is "+type);
        }
        else if(getWeight()<120){
            type="female";
            System.out.println("type is "+type);
        }
        else if(getWeight()>120){
            type="male";
            System.out.println("type is "+type);
        }
    }

    public void description(){
        System.out.println("numTeeth = "+getNumTeeth()+" spots= "+getSpots()+" weight = "+getWeight());
    }

}
