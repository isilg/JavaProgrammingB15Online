package day34;
public class Both_Monkeys_Are_Smiling_Or_Not {
    public static void main(String[] args) {
    /** We have two monkeys, a and b, and the parameters aSmile and bSmile
     *  indicate if each is smiling. We are in trouble if they are both
     *  smiling or if neither of them is smiling. Return true if we are in trouble.
     For example :
     monkeyTrouble(true, true) → true
     monkeyTrouble(false, false) → true
     monkeyTrouble(true, false) → false
     public static void main(String[] args) {
      */
        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble(true,false));

        System.out.println(monkeyTrouble2(true,true));
        System.out.println(monkeyTrouble2(false,false));
        System.out.println(monkeyTrouble2(true, false));

    }

    //**************** AFTER CREATING METHOD WRITE /** THEN CLICK ENTER
    //IT WILL CREATE PARAMETERS AUTOMATICALLY

    /**
     *
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static String monkeyTrouble(boolean aSmile, boolean bSmile ){
        if( (aSmile && bSmile) || (!aSmile && !bSmile) ){
            return "Yes";
        }else
            return "No";
    }

    //II.WAY
    public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile ) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
}







