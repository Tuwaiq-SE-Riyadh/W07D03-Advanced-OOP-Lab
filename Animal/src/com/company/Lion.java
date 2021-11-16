package com.company;

public class Lion extends Animal{

    String lionType;

public Lion(int numTeeth, boolean spots, int weight){
    super(numTeeth,spots,weight);
    SetLionType();
}
public void SetLionType(){
    if(getWeight()<80)
        lionType="cub";
    else if(getWeight()<120)
        lionType="female";
    else
        lionType="male";
}
public void print(){
    System.out.println(getNumTeeth());
    System.out.println(getSpots());
    System.out.println(getWeight());
    System.out.println(lionType);
}
}
