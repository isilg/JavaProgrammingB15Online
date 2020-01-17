package day31;

import java.util.Arrays;

public class Remainder_Arrays {
    public static void main(String[] args) {


        //REMINDER:
        int[] nums = {1, 5, 3, 4};
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        //NUMS ARRAY INT AMA Arrays.toString() KULLANDIGIN ANDA
        //HEMEN STRING E ATAMAK ZORUNDASIN CUNKU
        //Arrays.toString() ARRAY I STRING E CEVIR DEMEK
        String part = Arrays.toString(nums);
        System.out.println(part);

        String[] names = {"Ayse", "Fatma", "Hatice", "Emine"};
        Arrays.sort(names);
        String part2 = Arrays.toString(names);
        System.out.println(part2);
        //ILK KARAKTERI BOYLE CAGIRMAK DOGRU OLURMU BILMIYORUM AMA DENEDIM
        System.out.println(part2.substring(1, 2));

        double[] doub = {0.0, 0.1, 0.2};
        String part3 = Arrays.toString(doub);
        System.out.println(part3);

        System.out.println("\t");
    }
}