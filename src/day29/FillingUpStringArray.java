package day29;
import java.util.Arrays;
public class FillingUpStringArray {
    public static void main(String[] args) {

        //Create an array with size 10 and fill it up with I love Java
        String[] strArr = new String[10];

        for(int i=0; i< strArr.length; i++){
            strArr[i]= (i+1) + ".I love Java";  //i yani 0 dan degilde i+1 yani 1 den basladik
        }
        System.out.println("strArr = "+ Arrays.toString(strArr));


        System.out.println();
        String str = new String("ABC");    //THIS IS STRING OBJECT WITH VALUE ABC
        String[] strArr2 = new String[5];          //EMPTY STRING ARRAY WITH CAPACITY 5
        System.out.println(str);                  //PRINTS ABC
        System.out.println(Arrays.toString(strArr2));   //PRINTS [null,null,null,null,null]


        strArr2[0]="I Love Java";
        strArr2[1]="I Love Java";
        strArr2[2]="I Love Java";
        strArr2[3]="I Love Java";
        strArr2[4]="I Love Java";
        System.out.println(Arrays.toString(strArr2));
    }
}