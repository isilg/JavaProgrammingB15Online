package day25;

import java.util.Arrays;

public class String_To_Char_Array_Method {
    public static void main(String[] args) {

        //BU STRING I CHAR ARRAY E DONUSTUR
        //YANI name=[i,s,i,l, ,a,v,u,d,u,k] seklinde dondur
        //I. WAY -- >> FOR LOOP,  II.WAY -->> FOR EACH LOOP  III.WAY -->> METHOD
        String name = "Isil Avunduk";

        char[] nameChar = new char[name.length()];

        for( int i=0; i<name.length() ; i++ ){
            nameChar[i] = name.charAt(i);
        }

        System.out.println(nameChar);  // boyle yazarsan ne print yapar?
        System.out.println(Arrays.toString(nameChar));



        //II.WAY
        //Turn  String name = "Isil Avunduk"; into charArray() method
        //method of String.  toCharArray() is a method of String that turns String into char array
        System.out.println();
        char[] nameChar2 = name.toCharArray();
       // System.out.println("aaaa"+name.toCharArray());
        for(char eachChar : nameChar2){
            System.out.println("eachChar= "+ eachChar);
        }


        //III.WAY
        System.out.println();
        char[] nameChar3 = name.toCharArray();
        System.out.println("nameChar3 = " + Arrays.toString(nameChar3));

    }
}
