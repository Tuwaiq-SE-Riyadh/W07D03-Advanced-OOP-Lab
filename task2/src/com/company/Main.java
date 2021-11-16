package com.company;

public class Main {

    public static void main(String[] args) {
    Cheetah cheetah1=new Cheetah(20,false,80);
    cheetah1.setChiled(new String[]{"One", "tow", "three", "four", "five"});


        cheetah1.setName("CHEETAH");
        System.out.println(cheetah1.toString());
    }
}
