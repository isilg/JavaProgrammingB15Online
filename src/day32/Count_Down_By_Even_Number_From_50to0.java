package day32;
import javax.swing.plaf.IconUIResource;
public class Count_Down_By_Even_Number_From_50to0 {
    /**
     * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     */


    public static void main(String[] args) {
        countDownByEvenNumberFrom50to0();
    }

    public static void countDownByEvenNumberFrom50to0() {
        for (int i = 50; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

