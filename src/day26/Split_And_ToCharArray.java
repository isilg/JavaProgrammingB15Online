package day26;

import java.util.Arrays;

public class Split_And_ToCharArray {
    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 Month Survey";
        char[] surveyChars = survey.toCharArray();

//        for(char each : surveyChars){
//            System.out.println("each char is: "+each);
//        }
//
//        System.out.println();
//        //TRY WHILE JUST FOR FUN
//        int x = 0;
//        while( x<surveyChars.length ){
//            System.out.println( "each char is: " + surveyChars[x] );
//            x++;
//        }

        //FOR FUN DO WHILE
//        int y=0;
//        do{
//            System.out.println("each char is: " + surveyChars[y]);
//            y++;
//        }while ( y< surveyChars.length);


        //DO ALPHABETIC ORDER
        System.out.println("BEFORE surveyChars: " + Arrays.toString(surveyChars));

        Arrays.sort(surveyChars);
        System.out.println("AFTER surveyChars: " + Arrays.toString(surveyChars));

    }
}
