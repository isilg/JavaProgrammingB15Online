package day21;

public class Skip_All_5s {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {
            if ( i % 5 == 0){
                System.out.println("SKIPPING " +i);
                continue;
            }
            System.out.println(i);


            //II.WAY

//            for (int i = 1; i <= 100 ; i++) {
//                if ( i % 5 != 0){
//                    System.out.println(i);
//                }else
//                System.out.println("SKIPPING "+i);


        }
    }
}
