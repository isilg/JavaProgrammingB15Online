package day24;
import java.util.Arrays;
public class ArraysMethodSorting {
    public static void main(String[] args) {

        int[] scores = {99,44,66,23,19,55};

        //PRINT OUT ITEMS OF THE ARRAY
        System.out.println(Arrays.toString(scores));

        //sort the array in ascending order
        //XXXXXXX System.out.println(Arrays.sort(scores));
        //Once sort yap yani ascending order da duzenle sonra Arrays.toString ile ekrana dondur
        //'sort' yaptiktan sonra original array will ben gone. No more old array

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        //GET THE FIRST ITEM VALUE
        System.out.println("First item value: "+ scores[0]);

        System.out.println();
        char[] nameChars = { 'G', 'A', 'D', 'Z', 'C','A' };
        System.out.println( "Array before 'sort': " + Arrays.toString(nameChars) );
        Arrays.sort(nameChars);
        System.out.println( "Before before 'sort': " + Arrays.toString(nameChars) );

        System.out.println();
        char[] nameChars2 = { 'G', ' ', 'd', 'Z', '9','A' };
        System.out.println( "Array before 'sort': " + Arrays.toString(nameChars2) );
        Arrays.sort(nameChars2);
        System.out.println( "Array after 'sort': " + Arrays.toString(nameChars2) );

        System.out.println();

        String[] superHeroes ={"Superman","Batman","Wonder Woman", "Aquaman", "Cyborg","Flash", "100", "9"};
        //sort method kullansan 9 mu once doner 100 mu??
        //Ilk character ve ilk sayiya bak hep.  1 < 9 o yuzden 100 once doner
        Arrays.sort(superHeroes);
        System.out.println(Arrays.toString(superHeroes));

        System.out.println();
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        //Arrays.sort(fiveSwitchOnOffs);  XXXXXXXXXXXX ERROR XXXXXXXXXXXXXXXX
        System.out.println( "fiveSwitchOnOffs= " +Arrays.toString(fiveSwitchOnOffs) );
        //SORT METHOD DOESNT WORK FOR BOOLEAN ARRAY


    }
}
