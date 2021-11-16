package com.company;

public class Main {

    public static void main(String[] args) {
        Lion lionOne = new Lion(50, true, 110);
        System.out.println(lionOne.display());
        Cheetah ceetahOne = new Cheetah(50, true, 110,"Male");
        System.out.println(ceetahOne.display());
    }
}
