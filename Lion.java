package com.company;

public class Lion extends Animal {

    String type;

    public Lion(int numTeeth, boolean spots, int weight ) {
        super(numTeeth, spots, weight);

    }

    public String setType(int weight) {

        if (weight < 80 && weight > 0) {
            return type = "cub";
        } else if (weight < 120) {
            return type = "female";
        } else if (weight > 120) {
            return type = "male";
        }
        return "You enter invalid number";

    }

    public String display() {
        return "Name of Animal: Lion\n Number of teeth: " + getNumTeeth() + "\n Weight: " + getWeight() + "\n Type: " + setType(getWeight());
    }
}
