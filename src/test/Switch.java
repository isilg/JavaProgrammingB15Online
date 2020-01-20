package test;
public class Switch {
    public static void main(String[] args) {

        /**
         * switch(expression) {
         *   case x:
         *     // code block
         *     break;
         *   case y:
         *     // code block
         *     break;
         *   default:
         *     // code block
         * }
         */
        System.out.println( getDay() );
    }

    public static String getDay(){

    int day = 4;
    switch (day) {
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
        case 7:
            return "Sunday";
        default:
            return "Invalid number";
    }
   }
}
