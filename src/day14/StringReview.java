package day14;

public class StringReview {
    public static void main(String[] args) {


        //STRING METHODS WE KNOW SO FAR
        //Equals , EqualsIgnoreCase, ToUpperCase, ToLowersCase, length, startsWith(), endsWith()
        //Today we will learn  charAt(), contains(), indexOf(), lastIndexOf(), substring(), isEmpty(), trim(), replace( , )



        String str1 = "Pumpkin";

        System.out.println( str1.equals("pumpkin") );  //DONT FORGET JAVA IS CASE SENSITIVE SO IT WONT TURN TRUE
        System.out.println( str1.equals("Pumpkin"));



        // contains: it checks weather a string exists in another string
        String str2 = "I love pumpkin";
        System.out.println( str2.contains("pumpkin") );

        //lets store the result to be able to use it later
        boolean gotPumpkin = str2.contains("pumpkin");

        //to return your result on the screen type sout it shows soutv, soutm, soutp and explains
        //what they do on the right side of the shortcut. Here we use soutv then click Enter to print variable value in nice format
        System.out.println("gotPumpkin = " + gotPumpkin);



        //startsWith endsWith: check whether a string starts with another string and check whether
        //a string ends with another string and return true or false result

        boolean startedWithI = str2.startsWith("I");
        System.out.println("started With I = " + startedWithI);      //I used  soutv  here then give space between started and with and i(ben duzenledim yani ekrana cikacak mesaji)

        boolean endWithPumpkin = str2.endsWith("Pumpkin");          // case sensitive!
        System.out.println("end With Pumpkin = " + endWithPumpkin);

    }
}
