package day26;

import java.util.Arrays;

public class Count_Item_In_Array {
    public static void main(String[] args) {
        String[] marvelHeros = {"Iron Man", "Capitan America", "Spiderman", "Balck Panther",
                "Hulk", "Black Widow", "Wanda", "Capitan Marvel", "Capitan America",
                "Spiderman", "Black Widow", "Wanda", "Capitan Marvel", "Capitan America"};


        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));
        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));
        int sizeOfArray = marvelHeros.length;
        System.out.println("Hero count = " + sizeOfArray);


        String itemToSearch;
        itemToSearch = "Black Widow";
        int countOfItem = 0;

        for (String eachHero : marvelHeros) {

            if (eachHero.equals(itemToSearch)) {
                countOfItem++;
            }

        }

        System.out.println();

        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK
        System.out.println("countOfItem = " + countOfItem);

        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK IN CASE INSENSITIVE MANNER
        int cntOfBlackInName = 0;

        for (String eachHero : marvelHeros) {
            // in order to not care about the case , make all lowercase then check contains
            if (eachHero.toLowerCase().contains("black")) {
                cntOfBlackInName++;
            }

        }
        System.out.println("cntOfBlackInName = " + cntOfBlackInName);


        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK

        System.out.println("countOfItem = " + countOfItem);


    }
}
