package day32;
public class String_Repeater_As_A_Given_Number {
    /**
     * String repeater method has 2 parameters
     * String strToRepeat and int count
     * repeat printing the string as many time as <count> number define
     */

    public static void main(String[] args) {

        countTimesString("Java", 3);
        System.out.println("\t");
        countTimesString("Everything is awesome", 3);

    }

    public static void countTimesString(String strToRepeat, int count){
        for (int i=1 ; i<=count; i++){
            System.out.print(i+"." +strToRepeat+" ");
        }
    }

}
