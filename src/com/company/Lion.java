package com.company;

public class Lion extends Animal {
     String type;
    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);

    }

    public void type(){
        if (this.getWeight()<=80){
            type= "cub";
            System.out.println("the type is "+ " "+ type );
        } else if(this.getWeight() > 81&& this.getWeight() <120 ){
            type= "female";
            System.out.println("the type is "+ " "+ type );
        }else if(this.getWeight()>120 ){
            type= "male";
            System.out.println("the type is "+ " "+ type );
        }
    }

//    public void getWeight() {
//
//    }
}
