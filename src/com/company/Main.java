package com.company;

public class Main {

    public static void main(String[] args) {
	 Lion lion = new Lion(30,true,140);
     String[] cheetahArray= {"Asiatic cheetah","Northwest African cheetah","South African cheetah"};
        lion.printAnimal();
        Cheetah cheetah = new Cheetah(30,true,120,cheetahArray);
        System.out.println(cheetah.toString());;
    }
}
