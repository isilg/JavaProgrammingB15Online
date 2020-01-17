package day21;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {

//        Given your name stored in a variable myName as String
//        for example :  String myName = "My name is Your name here" :
//        1, loop through each and every character print them out like this :  M->y-> >n->a->m->e-> and so on
//        put arrow in between the character
//        2 , print the sentence by 2 character at a time just by incrementing by 1
//        3 , print the sentence by 3 character at a time
//        4 , print the sentence by 4 character at a time

        String myName = "Isil Avunduk";

        for( int i = 0 ; i < myName.length() ; i++ ){           //MY WAY
        //for( int i = 0 ; i <= myName.length()-1 ; i++ ){      //AKBAR'S WAY
            //System.out.print(myName.charAt(i)+ "->");
            System.out.print(myName.substring(i,i+1) + "->");
        }
        System.out.print("\n---------------\n");


        for (int i = 0; i <= myName.length()-2; i++) {
            System.out.print( myName.substring(i,i+2)+ "->" );
        }
        System.out.println("\n---------------");


        for (int i = 0; i <= myName.length()-3; i++) {
            System.out.print( myName.substring(i,i+3)+ "->" );

        }


    }
}
