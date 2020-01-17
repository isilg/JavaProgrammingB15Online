package day24;
import java.sql.SQLOutput;
import java.util.Arrays;
public class ArrayClassMethod_toString_sort_equals {
    public static void main(String[] args) {

        //for printing the content of the Array
        //toString -->> Arrays.toString(arrayname);
        //***********ONEMLIIIIIIII********
        //Arrays.toString() method returns a string representation of the contents of the specified array
        //Yani eger Arrays.toString() kullanirsan sonus string donerrrrrrrr

        //for sorting an Array in ascending order
        //sort -->> Arrays.sort(arrayname)

        //for checking for equality of 2 array object content
        //equals -->>Arrays.equals(firstArray,secondArray)

        String[] superHeroes ={"Superman","Batman","Wonder Woman", "Aquaman", "Cyborg","Flash"};
        System.out.println(Arrays.toString(superHeroes));

        System.out.println();

        //charAt method unu kullanirsak superHeroes array ine ne elde ederiz?
        System.out.println(Arrays.toString(superHeroes).charAt(0));
        System.out.println(Arrays.toString(superHeroes).charAt(1));
        System.out.println(Arrays.toString(superHeroes).charAt(2));
        System.out.println(Arrays.toString(superHeroes).charAt(3));
        //Arrays.toString(superHeroes) PRINTS -->>[Superman,Batman,Wonder Woman,Aquaman,Cyborg,Flash]
        //Arrays.toString(superHeroes).charAt(0) -->> ONCE ARRAY E DONUSTURUP SONRA ONUN UZERINDEN ISLEM YAPAR.
        //{......} DEGIL [.......] BU ARRAY I DUSUN
        //ARRAY CHAR(0) -->> [ (ARRAY IN ICINE ATLAMA HEMEN ILK CHARACTER OPENING BRACKET),
        //ARRAY CHAR(1) -->> ARRAY IN 2. CHARACTER

        //Array in ilk elemanini dondur sonra 2nd elemani dondur
        System.out.println("First item value: " +superHeroes[0] );
        System.out.println("Second item value: "+superHeroes[1]);

        System.out.println();
        int[] nums = {10,44,55,3,78};
        System.out.println(Arrays.toString(nums).charAt(0));
        System.out.println(Arrays.toString(nums).charAt(1));
        System.out.println(Arrays.toString(nums).charAt(2));
        System.out.println(Arrays.toString(nums).charAt(3));


        //CREATE A DOUBLE ARRAY OF 3 ITEMS; AND PUT 3 VALUE
        //GET A STRING REPRESENTATION OUT OF THIS ARRAY(YANI BRACKETLAR ICINDE ELEMANLARI YAZ)
        //AND SAVE IT AS priceString. PRINT EACH CHARACTER IN THIS STRING AND FORMAT WILL BE:
        //character at index 0 is: your_character
        //character at index 1 is: your_character
        //.............

        double[] arr = {1.2, 2.3, 3.3};
        String priceString = Arrays.toString(arr); //*****priceString in type i double olmaz String olcak*******

        for (int i=0; i<priceString.length(); i++){
            System.out.println("Character at index "+i+ "is: "+priceString.charAt(i));
        }


    }
}
