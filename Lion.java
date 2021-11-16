public class Lion extends Animal{


    String field ; // (cub, male, female).

    // Lion constructor.
    public Lion (int numTeeth, boolean spots, int weight)
    {
        super(numTeeth,spots,weight);
        setType(); // This for add value to field.
    }

    public void setType ()
    {
        this.field = (super.getWeight()) < 80 ? "cub" : (super.getWeight()) < 120 ? "female" : "male" ;
    }

    public void getDescription ()
    {
        System.out.println("This Lion has ["+super.getNumTeeth() +" Teeth]," +
                " ["+super.getSpots() +" Spots], ["+super.getWeight() +
                " Weight], ["+this.field +" Field]");
    }

}
