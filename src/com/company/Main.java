package com.company;

public class Main {

    public static void main(String[] args) {
        Lion l1=new Lion(1,false,200);
        l1.type();
        int []a={1,2,3,4};
        Cheetah ch=new Cheetah(1,false,200,a);
        System.out.println( ch.toString());
    }
}
