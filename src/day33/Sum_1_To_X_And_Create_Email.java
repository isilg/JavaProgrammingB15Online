package day33;

public class Sum_1_To_X_And_Create_Email {
    /**
     * TASK 01:
     * getSumFrom1ToX method calculates the sum of
     * the numbers from 1 to the number user passed
     * @param x final number to be added
     * @return the sum of numbers from 1 to x as int
     */

    /** TASK 02:
     * buildEmail method should build email using user's full name
     * for example Jon Snow -->> JSnow@NightWatch.com
     * @param firstName
     * @param lastName
     * @return the email created firstName initial + lastName + @NightWatch.com
     */

    public static void main(String[] args) {
        System.out.println( getSumFrom1ToX(10) );

        System.out.println( buildEmail("Isil", "Avunduk") );
    }

    public static int getSumFrom1ToX(int x){
        int sum = 0;
        for (int i=1; i<=x; i++){
            sum += i;
        }
        return sum;
    }

    public static String buildEmail(String fName, String lName){
        return fName.charAt(0)+lName+"@NightWatch.com";
    }


}
