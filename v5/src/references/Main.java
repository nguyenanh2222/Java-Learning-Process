package references;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static int a = 5;
    static int b = 10;
    static Integer c = 20;
    static Integer d = 40;

    public static void main(String[] args) {

        Set<References> mySet = new HashSet<>();

        References references1 = new References(2,3);
        References references2= new References(3,4);
        References references3 = new References(2,5);


        mySet.add(references1);
        mySet.add(references2);
        mySet.add(references3);

        for (References re : mySet)
            System.out.println(re);
    }
    public static void repair (References references1){
        references1.a = 6;
        references1.b = 7;
    }
    public static void repair (String name){
        name += " Da sua";
        System.out.println("HAM: "+ name);

    }
    public static void repair (StringBuilder name){
        name.append(" Da sua");
        System.out.println("HAM: "+ name);

    }

    public static void change (References re){
//        References temp = new References(re);
        System.out.println(re);
    }

}
