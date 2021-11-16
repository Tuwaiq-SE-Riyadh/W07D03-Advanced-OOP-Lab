package com.company;

import java.util.Arrays;

public class Lion extends Animal {
   private  String type;


     public Lion(int numTeeth, boolean spots, int weight) {
          super(numTeeth, spots, weight);


     }

     public void setType(String type) {
          if (getWeight() < 80) {
//               this.type = type;
               System.out.println("  cub ");


          } else if (getWeight() < 120) {
               this.type = type;
               System.out.println("famale");
          } else {
               this.type = type;
               System.out.println("male");
          }
     }

     public String getType() {
          return type;
     }

     public String toString() {
          return "Lion {" +
                  getNumTeeth()+" ,"+getSpots()+" ,"+getWeight() +'}';
     }
}
