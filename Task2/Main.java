package com.company;

public class Main {

    public static void main(String[] args) {
        int arr1[] ={1};
        int arr2[] ={2};
        int arr3[] ={3};

        Cheetah c1 = new Cheetah(10,true,50, 5, arr1);
        Cheetah c2 = new Cheetah(13,false,55,13, arr2);
        Cheetah c3 = new Cheetah(12,true,70,10, arr3);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }
}
