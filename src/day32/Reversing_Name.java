package day32;
import org.w3c.dom.ls.LSOutput;
public class Reversing_Name {
    public static void main(String[] args) {

        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tokun");

        System.out.println();
        reverseName();

        System.out.println();
        reverseWithDash("Isil Avunduk");

    }

    public static void reverseName(){
        String name2 = "Isil";
        for (int i = name2.length() - 1; i >= 0; i--) {
            System.out.print(name2.charAt(i));
        }
    }



    //TASK 3: REVERSE THE NAME ARASINA DASH KOY
    public static void reverseWithDash(String name){
        for (int i = name.length() - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(name.charAt(i) + "-");
            } else {
                System.out.print(name.charAt(i));
            }
        }
    }

    public static void printStringWithDashInBetween(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (i != name.length() - 1) {
                System.out.print(name.charAt(i) + "-");
            } else
                System.out.print(name.charAt(i));
        }
//        for (int i = 0; i < name.length(); i++){
//            System.out.print(name.charAt(i));
//            if ( i != name.length()-1 ){
//                System.out.print("-");
//            }
//        }



        }

    }