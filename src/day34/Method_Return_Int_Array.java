package day34;
import java.util.Arrays;
public class Method_Return_Int_Array {

    public static void main(String[] args){
        String sentence = "I adore Java";

        char[] eachChars = sentence.toCharArray();
        System.out.println(eachChars);

        String[] eachWords = sentence.split(" ");
        System.out.println( Arrays.toString(eachWords) );


        System.out.println( Arrays.toString(returnArr()) );
    }

    private static int[] returnArr() {
        int[] myArr = {57, 75};
        return myArr;
    }

}
