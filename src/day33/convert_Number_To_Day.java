package day33;
public class convert_Number_To_Day {
    /**
     * getDaysOfTheWeekFromNumber method will take number from 1-7
     * and convert that to actual day in word
     * @param int dayCode to represent day in number
     * @return the day in word as String if the number is valid
     * if the number is not valid return "number is not valid"
     */

    public static void main(String[] args) {

        System.out.println( getDaysOfTheWeekFromNumber(1) );
        System.out.println( getDaysOfTheWeekFromNumber(3) );
        System.out.println( getDaysOfTheWeekFromNumber(8) );

        System.out.println("-----------");
        int[] allCodes = {5, 3, 11, 4, 33};
        for (int x = 0; x < allCodes.length; x++) {
            String day = getDaysOfTheWeekFromNumber(allCodes[x]);
            System.out.println("day = " + day);

        }
    }

    //it returns a String, the day in word as String
    public static String getDaysOfTheWeekFromNumber(int dayCode) {
        switch (dayCode) {
            case 1:
               return "Monday";
            case 2:
                return"Tuesday";
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
                return "Invalid Number";
        }

    }

}