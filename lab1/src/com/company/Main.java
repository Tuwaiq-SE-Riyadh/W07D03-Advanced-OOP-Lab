package com.company;

public class Main {

    public static void main(String[] args) {
	Lion lion= new Lion(40,false,140);
        lion.print();
        String [] arr = {"Asiatic Cheetah", "Northwest African Cheetah", "South African Cheetah"};
        Cheetah cheetah = new Cheetah(45,true,130,arr);
        System.out.println( cheetah.toString());
        System.out.println(cheetah.getType());







    }
}
