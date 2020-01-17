package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Print_Array_12_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 =  sc.nextLine();
        String l2 =  sc.nextLine();
        String l3 =  sc.nextLine();

        String[] languages = {l1, l2, l3};
        //         0    1   2
        System.out.println(languages[2]);

        // 1. print all values
        System.out.println(Arrays.toString(languages));

        //2. for each
        for (String lan : languages) {
            System.out.println("Here is the language: " + lan);
        }

        //3.for loop
        for (int languageIndex = 2; languageIndex >= 0; languageIndex--) {
            System.out.println(languages[languageIndex]);
        }

    }
}
