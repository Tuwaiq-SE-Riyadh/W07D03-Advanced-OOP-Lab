import java.util.Arrays;

public class Cheetah extends Animal{

    static int cheetahSpeed ;
     String [] cheetahTop3Places  = new String[3];


    // Cheetah constructor.
    public Cheetah (int numTeeth, boolean spots, int weight, int cheetahSpeed, String [] cheetahTop3Places)
    {
        super(numTeeth,spots,weight);
        Cheetah.cheetahSpeed = cheetahSpeed;
        this.cheetahTop3Places = cheetahTop3Places;
    }


    public void setCheetahSpeed (int cheetahSpeed)
    {
        Cheetah.cheetahSpeed = cheetahSpeed;
    }
    public static int getCheetahSpeed ()
    {
        return Cheetah.cheetahSpeed;
    }


    public String toString()
    {
        return "This Cheetah has ["+super.getNumTeeth() +" Teeth]," +
                " ["+super.getSpots() +" Spots], ["+super.getWeight() +
                " Weight], ["+Cheetah.cheetahSpeed +"km/h cheetahSpeed], and 3 Top Places are "+
                Arrays.toString(this.cheetahTop3Places);
    }
}
