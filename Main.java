package com.company;

public class Main {

    public static void main(String[] args) {
        //Lion Class
	    Lion lion1 = new Lion(20,true,70,"none");
        lion1.description();
        lion1.setLionType();
        Lion lion2 = new Lion(50,true,115,"none");
        lion2.description();
        lion2.setLionType();
        Lion lion3 = new Lion(90,false,150,"none");
        lion3.description();
        lion3.setLionType();

        // Cheetah Class
        String [] arr = {"1","2","3"};
        Cheetah cheetah1 = new Cheetah(50,true,70,100,arr);

        System.out.println(cheetah1.toString());
    }
}
