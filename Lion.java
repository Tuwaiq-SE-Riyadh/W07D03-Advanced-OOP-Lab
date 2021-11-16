package AdvanceOopLab;

public class Lion extends Animal {
	
	private String type;

	public Lion(int numTeeth, boolean spots, int weight) {
		super(numTeeth, spots, weight);
		this.setType(weight);
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(int weight) {
		if(weight < 80){
			this.type = "cub";
		}
		else if(weight < 120){
			this.type = "female";
		}
		else if(weight > 120){
			this.type = "male";
		}
	}
	
	public void prinLlionInfo(){
		System.out.println("Number of Teeth: " + getNumTeeth() + "\nSpots: " + getSpots() + "\nWeight: " + getWeight() + "kg" + "\nType: " + getType() + "\n");
	}
}
