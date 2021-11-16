package com.company;

public class Cheetah extends Animal{

    static int age;
    static int child [] = new int[1];

    public Cheetah(int numTeeth, boolean spots, int weight, int age, int ch) {
        super(numTeeth, spots, weight);
        this.age = age;
        child[0] = ch;
    }


    public String toString(){

        System.out.println();
        return "num teeth = > " + getNumTeeth() +
        "\n weight    = > " + getWeight() +
        "\n spots     = > " + getSpots() +
        "\n lionType  = > " + age +
        "\n child  = > " + child[0];

    }
}
