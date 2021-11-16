package com.company;

public class Main {

    public static void main(String[] args) {

        String[] name = {"Cheetah 1", "Cheetah 2", "Cheetah 3"};
        Cheetah cheetah1 = new Cheetah(2, false, 20, 2, name);
        System.out.println(cheetah1.toString());

        String[] name2 = {"Cheetah 4", "Cheetah 5", "Cheetah 6"};
        Cheetah cheetah2 = new Cheetah(2, false, 20, 2, name2);
        System.out.println(cheetah2.toString());
    }
}

