package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Lion lion1 =new Lion(12,true,120);
        Lion lion2 =new Lion(12,true,70);
        Lion lion3 =new Lion(12,true,100);
        System.out.println(lion1.toString());
        lion1.setType("");
        System.out.println(lion2.toString());
        lion2.setType("");
        System.out.println(lion3.toString());
        lion3.setType("");
        Cheetah Cheetah1= new Cheetah(16,true,150, new String[]{"cub", "famle", "male"});
        System.out.println(Cheetah1.toString());


      lion1.getType();
//        lion2.getType();
//        lion3.getType();


    }
}
