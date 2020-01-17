package TaskSolution;

import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {

       /*
       Ask user to enter full name, assuming name is 2 words
       Generate email account as below:
      It starts with first character of first name and last name then
      @NigtWatch.com
      for ex: Jon Snow -->> JSnow@@NigtWatch.com
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.nextLine();

        //ISTERSEN FIRST NAME I BU SEKILDE AYIRABILIRSIN AMA GEREK YOK
        //ISMI BUTUN OLARAK DUSUNUNCE ZATEN ILK CHARACTER ISMIN ILK HARFI==> name.charAt(0)
        //String fName = name.substring(0,name.indexOf(" "));

        // String lName = name.substring(name.indexOf(" ")+1,name.length()); diyebilirsin
        //ama last index i belirtmezsen zaten son index e kadar gider
        String lName = name.substring(name.indexOf(" ")+1);

        System.out.println(name.charAt(0)+lName+"@NigtWatch.com");

    }

}
