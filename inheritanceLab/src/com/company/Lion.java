package com.company;

public class Lion extends Animal {

    String type;
    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        this.setType();
    }

    private void setType() {
        if(this.getWeight()<80)
            this.type="cub";
        else if(this.getWeight()<120)
            this.type="female";
        else
            this.type="male";
    }

    @Override
    public String toString() {
        return "Lion type is: " + type + " number of teeth: " +this.getNumTeeth()+
                " spots: "+this.getSpots()+" weight: "+this.getWeight();
    }
}
