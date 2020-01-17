package day21;

public class OddNumberPrintRepetition_Nested_For_Loop {
    public static void main(String[] args) {

        //PRINT 1 TO 10 ODD NUMBERS 4 TIMES
        for (int i=1; i<=4; i++){
            System.out.println("Iteration: " + i);
           for (int x=1; x<=10; x++) {
               if (x % 2 == 1) {
                   System.out.print(x + " - ");
               }
           }
               System.out.println();

        }
    }
}
