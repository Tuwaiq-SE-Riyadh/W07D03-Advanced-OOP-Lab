package Java;

public class Lion extends Animal{
String type;
public Lion(int numTeeth, boolean spots, int weight){
    super(numTeeth,spots,weight);
}

public void setType(){
    if(getWeight()<80){
       this.type="Cup";
    }else
        if(getWeight()<120){
        this.type="female";
    }else
        if(getWeight()>120){
        this.type="male";
        }
}

public String getType(){
    return this.type;
}
public void print(){
    System.out.println("Type: "+type+"\nnumTeeth: "+getNumTeeth()+"\nspots: "+getSpots()+"\nWeight: "+getWeight());
}
}
