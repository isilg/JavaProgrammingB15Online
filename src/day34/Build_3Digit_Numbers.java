package day34;
public class Build_3Digit_Numbers {
    /**
     * write a method called threeDigitNumber
     * @param  3 int parameters : digit1 digit2 digit3
     * and it will return the 3 digit numbers you have build
     * for example digit 1 is 3, digit 2 7, digit 3 is 6 -->> 376
     * if any of digit1 digit2 digit3 is not within the range of 0-9
     * then change it to 0. For example if digit is 69, since it
     * is out of the 0-9 range, it will be assumed as 0
     *   for example :
     *     threeDigitNumber(4,2,4) --->> 424
     *     threeDigitNumber(0,2,1) --->> 21
     *     threeDigitNumber(65,6,9) --->> 69
     */

    public static void main(String[] args) {
        //6,4,0 --> are called arguments
        System.out.println( threeDigitNumber(6,4,0) );
        //0,2,1 --> arguments
        System.out.println( threeDigitNumber(0,2,1) );
        System.out.println( threeDigitNumber(65,6,9) );
        System.out.println( threeDigitNumber(16,14,90));
    }

    public static int threeDigitNumber(int digit1, int digit2, int digit3) {
        //for example let's build 376
        //int digit1, digit2, digit3
        //digit1 = 3;
        //digit2 = 7;
        //digit3 = 6;
        //int number = digit1 * 100+digit2*10 +digit3;

        //SEPARATE IF STATEMENTS
        if (digit1 > 9 || digit1 < 0) {
            digit1 = 0;
        }
        if (digit2 > 9 || digit2 < 0) {
            digit2 = 0;
        }
        if(digit3 > 9 || digit1 < 0){
            digit3 = 0;
        }
        int number = digit1 * 100 + digit2 * 10 + digit3;
        return number;
    }
}
