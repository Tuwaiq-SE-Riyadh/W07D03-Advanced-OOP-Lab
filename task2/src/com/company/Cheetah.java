package com.company;

public class Cheetah extends Animal {
    static String name;
    String[] chiled= new String[5];

    public Cheetah(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
    }
    public static void setName(String name1){
        name=name1;
    }

    public static String getName(){
        return name;
    }

    public void setChiled(String[] chiled){
        for (int i=0;i<chiled.length;i++){
            this.chiled[i]=chiled[i];
        }
    }

    public String[] getChiled(){
        return chiled;
    }
    public String toString(){
        String output="";
        output+="\n numTeeth :"+getNumTeeth();
        output+="\n spots :"+getSpots();
        output+="\n weight :"+getWeight();
        output+="\n weight :"+getName();
        output+="\n childes :";
        for (int i=0;i<chiled.length;i++){
            output+=" "+getChiled()[i];
        }

        return output;
    }

}
