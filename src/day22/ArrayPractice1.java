package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

        double[] prices = new double[5];

        //CANNOT PRINT OUT ARRAY VARIABLE DIRECTLY TO SEE WHAT IS INSIDE BUT JUST CHAR ARRAY IS EXCEPTION
        System.out.println(prices);      // OUTPUT: [D@38af3868  , A MEMORY LOCATION

        prices[0] = 2.46;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500;
        prices[4] = 65.123;
        //IF I GO OVER THE RANGE IT GIVES 'OUT OF BOUNDS' ERROR (RUNTIME ERROR)
        //prices[5] = 165.3;  //ERROR

        System.out.println( prices[0] );
        System.out.println( prices[1] );
        System.out.println( prices[2] );
        System.out.println( prices[3] );
        System.out.println( prices[4] );

        System.out.println();

        //CREATE A CHAR ARRAY THAT HOLDS THE LETTER FROM YOUR FIRST NAME
        //ASSIGN VALUES USING EACH CHARACTERS OF YOUR FIRST NAME AND PRINT OUT EACH CHARACTER
        char[] firstName = new char[4];
        firstName[0] ='i';
        firstName[1] ='s';
        firstName[2] ='i';
        firstName[3] ='l';

        System.out.println( firstName[0] );
        System.out.println( firstName[1] );
        System.out.println( firstName[2] );
        System.out.println( firstName[3] );

        //YOU CAN JUST PRINT CHAR ARRAY LIKE THAT
        System.out.println(firstName);





    }
}
