package day33;
public class calculateAge {
    public static void main(String[] args) {
        /**
         * calculateAndReturnAge
         * This method will
         * calculate the the age according to the birth year
         * and return the age
         *
         * @param birthYear the number that represent birth year
         * @return the calculated value from the age
         * if the birth year is not within 1900-2020 then return 0
         */

        System.out.println( calculateAge(1982) );
    }

    public static int calculateAge(int birthYear) {
        if (birthYear >= 1900 || birthYear <= 2020) {
            return 2020 - birthYear;
        } else
            return 0;
    }

}
