package com.company;

public class Lion extends Animal {
    public String type="";
    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        lionType();
    }

        public void lionType() {

            {
                if (this.getWeight() >= 120) {
                    this.type = "Male";
                } else if (this.getWeight() < 120) {
                    this.type = "Female";
                } else if (this.getWeight() < 80) {
                    this.type = "Cub";
                }
                System.out.println("Animal = Lion" + "Teeth = " + this.getNumTeeth() + " Spots = " + this.getSpots() + " Weight = " + this.getWeight() + " Type = " + this.type);


            }

        }}

