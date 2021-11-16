package com.company;

public class Cheetah extends Animal{

    static int age;
    static int child [] = new int[1];

    public Cheetah(int numTeeth, boolean spots, int weight, int age) {
        super(numTeeth, spots, weight);
        this.age = age;
    }

    public void setChild(int numberChild){

        child[0] = numberChild;

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
