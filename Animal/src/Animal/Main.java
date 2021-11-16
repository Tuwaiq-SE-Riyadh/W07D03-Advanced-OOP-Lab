package Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lion lion1 = new Lion(20,true,50);
        lion1.setType();
        System.out.println(lion1.toString());
        Lion lion2 = new Lion(23,true,140);
        lion2.setType();
        System.out.println(lion2.toString());
        Lion lion3 = new Lion(10,false,88);
        lion3.setType();
        System.out.println(lion3.toString());
    }
}
