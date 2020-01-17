package test;

public class Reversing_PrintingDashBetween {
    public static void main(String[] args) {

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
}
