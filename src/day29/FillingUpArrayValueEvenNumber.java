package day29;
import taskChannel.Array;
import java.util.Arrays;
public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {

        //Create an int array with size 100 and fill it up as below
        //fill up this array with even number starting from 0

        int[] numbers = new int[100];

        System.out.println("Before filling up default value \n" + Arrays.toString(numbers));

        //look at the pattern and decide what last number could be
        numbers[0]=0;  //0*2
        numbers[1]=2;  //1*2
        numbers[2]=4;  //2*2
        numbers[3]=6;  //2*3
        numbers[4]=8;  //2*4
        numbers[5]=10; //2*5
        //.......
        numbers[99]=198;   //99*2

        for (int i=0 ; i< numbers.length; i++){
            numbers[i] = i*2;
        }
        System.out.println("After filling up \n" + Arrays.toString(numbers));

        System.out.println("\n");

        //PRINT AN ARRAY THAT HAS 3 ITEMS AND ALL OF THEM ARE: I LOVE JAVA
        String[] arr = new String[3];
        for (int i=0; i<3; i++){
            arr[i] = (i+1)+ ".I love Java";
        }
        System.out.println("strArr= " + Arrays.toString(arr)+" ");
    }
}
