public class Main {
    public static void main(String[] args) {

        // Lion
        System.out.println("---------------Lion---------------");
        Lion obj1 = new Lion(10,false,87);
        obj1.getDescription();

        // Cheetah
        System.out.println("---------------Cheetah---------------");
        String [] top3Places = {"Kenya","South Africa","Namibia"};
        Cheetah obj2 = new Cheetah(22,true,140,103,top3Places);
        System.out.println(obj2.toString());




    }
}
