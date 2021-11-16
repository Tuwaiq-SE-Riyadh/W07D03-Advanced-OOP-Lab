package com.company;

import java.util.Arrays;

public class Cheetah extends Animal{

    public int arr[];
    private int age ;

    public Cheetah(int numTeeth, boolean spots, int weight, int age, int arr[]) {
        super(numTeeth,spots,weight);
        this.age = age;
        this.arr = arr;

    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }


    @Override
    public String toString() {
        return "Cheetah{" +
                "a=" + Arrays.toString(arr) +
                ", age=" + age +
                ", numTeeth=" + getNumTeeth() +
                ", spots=" + getSpots() +
                ", weight=" + getWeight() +
                '}';
    }
}
