package com.company;

public class Lion extends Animal{
    private String type;

    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        this.typeLion();
    }

    public void typeLion(){
        if (this.getWeight()<=80){
            type="cup";
        }else if(this.getWeight()>80 && this.getWeight()<=120){
            type="female";
        }else if (this.getWeight()>120){
            type="male" ;
        }
    }

    public void print() {
        System.out.println("Lion Num Teeth " +this.getNumTeeth()+ "\nWeight\t"+this.getWeight()+
                "\nSpots\t"+this.getSpots()+
                "\ntype\t" + type );
    }
}
