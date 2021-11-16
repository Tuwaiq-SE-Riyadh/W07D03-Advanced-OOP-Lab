import java.util.Arrays;

public class Cheetah extends Animal{

    private static String name;
    String nameChild [];

    public Cheetah(int numTeeth, boolean spots, int weight , String name , String [] nameChild ) {
        super(numTeeth, spots, weight);
        this.name = name;
        this.nameChild = nameChild;
    }


    public static void setName(String name) {
        Cheetah.name = name;
    }

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +"\n Number of Teeth: " + getNumTeeth()
                + "\n Spots: " + getSpots()+
                "\n Weight: " + getWeight()+
               " \n Childs :" +  Arrays.toString(nameChild);
    }
}
