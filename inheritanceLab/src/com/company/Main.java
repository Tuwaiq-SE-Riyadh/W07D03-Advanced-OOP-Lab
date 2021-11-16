package com.company;

public class Main {

    public static void main(String[] args) {

        Lion lion1 = new Lion(30,true,115);
        System.out.println(lion1.toString());

        Cheetah cheetah1 = new Cheetah(52,true,155);
        cheetah1.setInformation("big cat");
        cheetah1.setInformation("black");
        System.out.println(cheetah1.toString());
    }
}
