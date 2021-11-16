package com.company;

public class Lion extends Animal {
    String type="";

    public Lion(int numTeeth, boolean spots, int weight ) {
        super(numTeeth, spots, weight);
        this.setType();
    }

    public void setType(){
        int we=super.getWeight();
        if(we<120){
            if(we<80){
                this.type="cub";
            }
            else{
                this.type="female";

            }
        }else{
            this.type="male";
        }
    }
    public String getType(){
        return type;
    }
    public  String print(){
        String output="";
        output+="\n the numTeeth :"+getNumTeeth();
        output+="\n the spots :"+getSpots();
        output+="\n the weight :"+getWeight();
        output+="\n the type :"+getType();
        return  output;
    }
}
