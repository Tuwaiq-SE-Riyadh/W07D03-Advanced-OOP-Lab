package com.company;

public class Lion extends Animal{
    public String type;


    public Lion(double weight) {
        super(weight);
        setType();
    }

    public  void  setType(){
        if(this.weight < 80){
            this.type = "cub";
        }
        else if(this.weight < 120){
            this.type = "female";
        }
        else {
            this.type = "male";
        }
    }

    @Override
    public String toString() {
        return "Lion{" +
                "type='" + type + '\'' +
                "weight='" + weight + '\'' +'}';
    }
}
