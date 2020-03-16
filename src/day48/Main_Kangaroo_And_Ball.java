package day48;

import java.util.List;

public class Main_Kangaroo_And_Ball {

    public static void main(String[] args) {

        Kangaroo k1 = new Kangaroo("Coco", 10);
        System.out.println("k1= "+k1);
        k1.bounce();
        k1.eat();
        k1.study();

        //I can use interface name as reference type
        Bounceable k2 = new Kangaroo("Toto",6);


        Ball b1 = new Ball("Round", "Blue");
        System.out.println("b1= "+b1);
        b1.bounce();




    }
}
