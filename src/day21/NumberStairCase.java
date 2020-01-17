package day21;

public class NumberStairCase {
    public static void main(String[] args) {

        for(int i=1; i<=4; i++){
            for (int x=1; x<=i; x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
