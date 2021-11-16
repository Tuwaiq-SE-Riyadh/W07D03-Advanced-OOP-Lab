package AdvanceOopLab;

import java.util.Arrays;

public class Cheetah extends Animal {
	
	static String speed;
	public String[] locations = new String [2];
	


	public Cheetah(int numTeeth, boolean spots, int weight, String[] locations){
		super(numTeeth, spots, weight);
		this.locations = locations;
	}
	
	public static String getSpeed() {
		return speed;
	}

	public static void setSpeed(String speed) {
		Cheetah.speed = speed;
	}
	
	public String toString(){
		return "Number of Teeth: " + getNumTeeth() + "\nSpots: " + getSpots() + "\nWeight: " + getWeight() + "kg" + "\nSpeed: " + speed + "\nLocations: " + (Arrays.toString(this.locations));
	}

}