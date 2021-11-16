package AdvanceOopLab;

public class Test {


	public static void main(String[] args) {
		Lion lion1 = new Lion(14, true, 90);
		lion1.prinLlionInfo();
		
		Lion lion2 = new Lion(16, false, 137);
		lion2.prinLlionInfo();
		
		String[] locations = {"Africa","Iran"};
		Cheetah cheetah = new Cheetah(10, true, 50, locations);
		Cheetah.speed = "90 km/h";
		System.out.println(cheetah.toString());
	}

}
