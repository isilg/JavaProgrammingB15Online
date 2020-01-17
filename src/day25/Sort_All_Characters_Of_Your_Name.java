package day25;

import java.util.Arrays;

public class Sort_All_Characters_Of_Your_Name {
    public static void main(String[] args) {

        //SORT ALL CHARACTERS IN ALPHABETICAL ORDER
        String name = "Isil avunduk";

        //Arrays.sort() methodunu kullanabiliriz fakat
        // Adi uzerinde, bu method array ler icin kullanilir
        //O zaman lets turn your string to an array

        char[] allCharsInName = name.toCharArray();

        Arrays.sort(allCharsInName);
        //sort yaptik allCharsInName e. Simdi ekrana dondurursen sorted hali doner cunku original array gone

        System.out.println("allCharsInName = " +Arrays.toString(allCharsInName) );


    }
}
