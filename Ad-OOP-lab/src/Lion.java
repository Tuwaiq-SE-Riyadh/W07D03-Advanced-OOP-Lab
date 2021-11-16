public class Lion extends Animal{

    private String type ;
    public Lion(int numTeeth, boolean spots, int weight ,String type) {
        super(numTeeth, spots, weight);
        this.type = type;

    }

    public void setType(String type){
        this.type = type;
    }

    public void LionInfo(){
        if(getWeight() < 80){
            setType("cub");
        }
        if(getWeight() <= 120 && getWeight() >= 80) {
            setType("female");
        }
        if(getWeight() > 120){
            setType("male");
        }

        System.out.println("Number of Teeth: " + getNumTeeth());
        System.out.println("Spots: " + getSpots());
        System.out.println("Weight: " + getWeight());
        System.out.println("Type: " + type);
    }

}
