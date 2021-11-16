package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lion lionOne = new Lion(22,false,10);
        lionOne.print();

        Cheetah cheetahOne = new Cheetah(22,false,10, 12);
        cheetahOne.setChild(3);
        System.out.println(cheetahOne);
    }
}

