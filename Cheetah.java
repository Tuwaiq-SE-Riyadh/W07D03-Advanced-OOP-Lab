package com.company;

public class Cheetah extends Animal {

    static String type;

    public Cheetah(int numTeeth, boolean spots, int weight,String type) {
        super(numTeeth, spots, weight);
        this.type = type;
    }

    public static void setType(String type) {
        type = type;
    }

    public static String getType() {
        return type;
    }
    public String display() {
        return "Name of Animal: Cheetah\n Number of teeth: " + getNumTeeth() + "\n Weight: " + getWeight() + "\n Type: " + getType();
    }
}
