package TaskSolution;

import java.util.Scanner;

public class StringTask5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name with prefix: ");
        String name = sc.next();

        //In case insensitive condition print as below
        //If the name started with (Dr ) turn Doctor, If the name started with (Mr ) turn Male,
        //If the name started with (Miss ) turn Single female, If the name started with (Mrs ) turn Married female,
        //CASE SENSITIVE DIYOR. BU TIP SORULARDA EN KOLAY YONTEM
        //BUTUN KARAKTERLERI UPPERCASE OLARAK DUSUNUP DEVAM ETMEK

        String upperCaseName = name.toUpperCase();

        if (upperCaseName.startsWith("DR ")){     //Kelimenin hepsini buyuk harfe cevirip islem yaptigimiz icin girilen
                                                 //tum kelimeler uppercase o yuzden buraya DR yazarken 2 karakteride buyuk yaziyoruz
            System.out.println("Doctor");
        }else if(upperCaseName.startsWith("MR ")){
            System.out.println("Male");
        }else if(upperCaseName.startsWith("MISS ")) {
            System.out.println("Single female");
        }else if(upperCaseName.startsWith("MRS ")) {
                System.out.println("Married female");
        }else{
            System.out.println("Invalid prefix");
        }

    }
}
