package com.company;
import java.util.Arrays;

public class Cheetah extends Animal{

    private static int age;
    String[] name;

    public Cheetah(int numTeeth, boolean spots, int weight, int age, String[] name){
        super(numTeeth, spots, weight);
        this.age = age;
        this.name = name;
    }

    public void setAge(int age){ this.age = age; }
    public int getAge(){ return age; }

    public String toString(){
        return super.toString() + " Cheetah name: "+ Arrays.toString(name);
    }
}
