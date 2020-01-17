package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {

        String name = "Arya Orman Muge Orman Isil Avunduk";

        int countOfA = 0;

        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            System.out.println(name.charAt(i));
            if (currentChar == 'a') {
                 System.out.println("BINGO FOUND IT !! ");
                ++countOfA; // countOfA 0 dan baslamisti, as long as if satisfies increase it by 1
            }
        }
        System.out.println("countOfA = " + countOfA);



        // from 1-100  print out all the numbers can be divided by 15 without remainder
        // from 1-100  count how many numbers can be divided by 15
//
        //AKBAR'S CODE
//        int counter = 0 ;
//
//        for (int i = 1; i <= 100 ; i++) {
//
//            if( i % 15==0 ){
//                System.out.println(i);
//                //counter = counter + 1 ;
//                //counter += 1 ;
//                ++counter ;
//            }
//
//        }
//        System.out.println("counter = " + counter);

        //MY CODE:
//        int counter=0;
//        for( int i = 1; i <=100; i++){
//            if (i % 15 == 0){
//                System.out.println(i);
//                ++counter;
//            }
//            i++;
//        }
//        System.out.println(counter+" tane 0 ile 100 arasinda 15 e bolunen sayi var");

    }
}
