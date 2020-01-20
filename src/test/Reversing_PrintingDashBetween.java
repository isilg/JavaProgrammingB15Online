package test;
public class Reversing_PrintingDashBetween {
    public static void main(String[] args) {

        comp2Array(new int[]{1,2,3} , new int[]{5,6-9,11,21});






        String name = "Isil";
        //index:       0123
        //length:      1234

        //TASK 1: REVERSE THE NAME

        for (int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }


        System.out.println();
        //TASK 2: ARADA CIZGILI NAME I YAZ
        for(int i=0; i<name.length(); i++){
            if ( i!= name.length()-1 ){
                System.out.print(name.charAt(i)+"-");
            }else
                System.out.print(name.charAt(i));
        }


        System.out.println("\t");
        //TASK 3: REVERSE THE NAME ARASINA DASH KOY
        for (int i=name.length()-1; i>=0 ; i--){
            if (i!=0){
                System.out.print(name.charAt(i)+"-");
            }else
                System.out.print(name.charAt(i));
        }




    }
    public static void comp2Array(int[] arr1, int[] arr2){
        if (arr1.length > arr2.length){
            System.out.println("Array 1 has more item");
        }else if(arr2.length > arr1.length){
            System.out.println("Array 2 has more item");
        }else
            System.out.println("They have same amount of element");
    }
}
