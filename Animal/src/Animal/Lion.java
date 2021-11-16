package Animal;

public class Lion extends Animal{
//    Expand the class to have features specific to a lion:
//    Add a field for lion type (cub, male, female).
//    Add a method in this class which sets the lion type based on its weight
//       (note that the weight is a derived field from the superclass).
//    If the weight is less than 80kg, it’s type should be a cub. If less than 120kg,
//       it should be female. If greater than 120kg, it is a male.
//    Include a method that will print out a description of a lion object.
    String type;
    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        this.type = "";
    }

    public void setType() {
        if (super.getWeight()<80){
            this.type = "cub";
        } else if (super.getWeight()<120){
            this.type = "female";
        } else if (super.getWeight()>120){
            this.type = "male";
        }
    }

    @Override
    public String toString() {
        return "Lion{" +
                "numTeeth='" + super.getNumTeeth() + '\'' +
                "spots='" + super.getSpots() + '\'' +
                "weight='" + super.getWeight() + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}
