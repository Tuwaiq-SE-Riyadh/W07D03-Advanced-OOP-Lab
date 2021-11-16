package Java;

import java.util.Arrays;

public class Cheetah extends Animal{
    private static int age=0;
    private static int childNum;
    String nameChild [];

    public Cheetah(int numTeeth, boolean spots, int weight,int age,int childNum,String []nameChild){
        super(numTeeth,spots,weight);
        this.age=age;
        this.childNum=childNum;
        this.nameChild=nameChild;
    }

    public static void setAge(int age) {
        Cheetah.age = age;

    }

    public static void setChildNum(int childNum) {
        Cheetah.childNum = childNum;
    }

    public static int getAge() {
        return age;
    }

    public static int getChildNum() {
        return childNum;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cheetah{" +
                "nameChild=" + Arrays.toString(nameChild) +
                '}';
    }
}
