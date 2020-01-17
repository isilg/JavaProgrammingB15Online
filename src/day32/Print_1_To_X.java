package day32;
public class Print_1_To_X {
    public static void main(String[] args) {
        /**
         * create a method that has 1 int parameter called x
         * print from 1 to that number in one line
         * print an empty line after the print.
         */
        print1toX(10);
        System.out.println();
        print1toX(8);
    }

    public static void print1toX(int x){
        for(int i=1; i<=x; i++){
            System.out.print(i+" ");
        }
    }
}
