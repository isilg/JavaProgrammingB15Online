package day29;
import java.util.Arrays;
public class Split_Practice {
    public static void main(String[] args) {

        //AFTER USING SPLIT TO A STRING WE GET ARRAYS. THIS IS WHT WE ASSIGNED
        //hero1.split("-") TO AN ARRAY
        //RULE:  whole string is split and returned in the form of a string array.

        String hero1 = "Superman-Clark J Kent";

        //split this String by dash - to get 2 pieces
        //of String into String array
        String[] heroSplitted = hero1.split(("-"));
        System.out.println("heroSplitted= "+ Arrays.toString(heroSplitted));

        System.out.println("\t");

        //GET EACH PART OF THE heroSplitted AND RETURN IT
        for(int i=0; i<heroSplitted.length; i++){
            System.out.println(heroSplitted[i]);
        }

        System.out.println(("\t"));
        // ***********  heroSplitted[0] -->>String not an array
        // so when you return it no need to use a method *********

        //II.WAY TO PRINT OUT EACH PART OF heroSplitted
//        String heroCode = heroSplitted[0];
//        String fullName = heroSplitted[1];
//        System.out.println( heroSplitted[0] );
//        System.out.println( heroSplitted[1] );


          String heroCode = heroSplitted[0];
          String fullName = heroSplitted[1];
          System.out.println("Hero code is "+ heroSplitted[0] + "and identity is "+ heroSplitted[1]);

        System.out.println("\t");
          //GET THE FIRST CHARACTERS OF THE NAME ==>>CK
         String[] fullNameSplitted = fullName.split(" ");
         System.out.println("fullNameSplitted: " +Arrays.toString( fullNameSplitted) );
         String lastName = fullNameSplitted[fullNameSplitted.length-1];
         System.out.println("Initial of the hero is: "+fullName.charAt(0)+lastName.charAt(0));


        System.out.println("\t");

        //II.WAY
        for (int i=0; i<fullNameSplitted.length; i++){
            System.out.print(fullNameSplitted[i].charAt(0));
        }


    }
}
