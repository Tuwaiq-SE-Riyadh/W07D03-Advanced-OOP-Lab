package com.company;

public class Cheetah extends Animal{
    static int[];



    public Cheetah(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);

    }

    public void  setType(String type){
        if (this.getWeight()<80){
            this.type = "cub";
        }
        else if (this.getWeight()<120){
            this.type = "Female";
        }
        else if (this.getWeight()>=120){
            this.type ="Male";
        }

    }

    public String getType(){
        return type;
    }

    public void printAnimal(){
        System.out.println("The Animal is Lion, Number Of Teeth is "+getNumTeeth()+", is it spots "+getSpots()+", it is weight is "+ getWeight()+ ", And it's type is "+getType());
    }
}

