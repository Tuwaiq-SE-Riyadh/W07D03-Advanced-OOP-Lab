package Java;

public class application  {
    public static void main(String[] args) {
//Create a Cheetah object and print it out the details that describe this object.
        String nameChild[]={"Cheetah01","cheetah02","cheetah03"};
        Cheetah  cheetah1=new Cheetah(20,true,120,30,3,nameChild);
        System.out.println(cheetah1.toString());

        String nameChild2[]={"Cheetah10","cheetah20"};
        Cheetah  cheetah2=new Cheetah(20,false,120,30,2,nameChild);
        System.out.println(cheetah1.toString());

    }
}
