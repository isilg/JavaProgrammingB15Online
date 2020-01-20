package day32;
import javax.management.MBeanAttributeInfo;
public class Count_Down_By_Even_Numbers_X_To_Y {
    public static void main(String[] args) {

        countDownByEvenNumbersXToY(20,2);
        countDownByEvenNumbersXToY(30,5);
        countDownByEvenNumbersXToY(10, 20);  //NOTHING RETURNS CAUSE IT DOESNT GO
                                                   // INSIDE THE LOOP
    }

    public static void countDownByEvenNumbersXToY(int x, int y){
        for (int i=x; i>=y; i--){
            if(i %2== 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

}