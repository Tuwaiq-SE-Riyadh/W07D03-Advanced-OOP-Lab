public class Main {
    public static void main(String [] args){

//        task1
        Lion lion = new Lion(12, true, 130 , "female");
        lion.LionInfo();

//        task2
        String Child[]={"Child1","Child2","Child3"};
        Cheetah  cheetah1=new Cheetah(22,true,130,"Cheetah1",Child);
        System.out.println(cheetah1.toString());

        String Child2[]={"Cheetah10","cheetah20"};
        Cheetah  cheetah2=new Cheetah(12,false,90,"Cheetah2",Child);
        System.out.println(cheetah1.toString());
    }
}
