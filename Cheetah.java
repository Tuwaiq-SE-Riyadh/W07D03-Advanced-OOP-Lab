package com.company;

import java.util.Arrays;

public class Cheetah extends Animal{
    private int speed;
    String [] arr;
    public Cheetah (int numTeeth,boolean spots,int weight,int speed,String[]arr){
        super(numTeeth,spots,weight);
        this.setSpeed(speed);
        this.arr=arr;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public String toString (){

        return getNumTeeth() + " " + getSpots()+ " "+ getWeight()+" "+getSpeed()+" "+ Arrays.toString(arr);
    }

}
