package com.company;

public class Cheetah extends Animal {

    private String[] information = new String[10];
    private int index =0;
    public Cheetah(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
    }

    public void setInformation(String ele) {
        this.information[index] = ele;
        setIndex();
    }

    private void setIndex() {
        this.index += 1;
    }

    private String[] getInformation() {
        return information;
    }
    private String printInformation() {
        String in ="";
        for (int i = 0; i < index; i++) {
            in += this.getInformation()[i]+", ";

        }
        return in;
    }
    public String toString() {
        return "Cheetah number of teeth: " +this.getNumTeeth()+
                " spots: "+this.getSpots()+" weight: "+this.getWeight()+" information: "+this.printInformation();
    }
}
