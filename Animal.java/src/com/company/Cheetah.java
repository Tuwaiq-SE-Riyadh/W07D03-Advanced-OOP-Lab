package com.company;

public class Cheetah extends Animal{

    static int age;
    static int child [] = new int[10];

    public Cheetah(int numTeeth, boolean spots, int weight, int age) {
        super(numTeeth, spots, weight);
        this.age = age;
    }

    public void print(){

        System.out.println();
        System.out.println("num teeth = > " + getNumTeeth());
        System.out.println("weight    = > " + getWeight());
        System.out.println("spots     = > " + getSpots());
        System.out.println("lionType  = > " + age);
    }
}
