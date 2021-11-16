package Animal;

import java.util.Arrays;

public class Cheetah extends Animal{
    static String color;
    String[] child;

    public Cheetah(int numTeeth, boolean spots, int weight, String newColor, String[] child) {
        super(numTeeth, spots, weight);
        color = newColor;
        this.child = child;
    }

    public static void setColor(String newColor) {
        color = newColor;
    }

    public static String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cheetah{" +
                "numTeeth='" + super.getNumTeeth() + '\'' +
                "spots='" + super.getSpots() + '\'' +
                "weight='" + super.getWeight() + '\'' +
                "color='" + color + '\'' +
                "child='" + Arrays.toString(child) +
                '}';
    }
}
