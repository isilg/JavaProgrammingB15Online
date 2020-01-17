package day30;
import java.util.Arrays;
public class SplitAnd_Define_The_Size {
    public static void main(String[] args) {
        String sentence = "I love Java Java Java";
        String[] wordsArray = sentence.split(" ");
        System.out.println("wordsArray = " + Arrays.toString(wordsArray) );
        System.out.println("wordsArray size= "+wordsArray.length);

        System.out.println("\t");
        //Limit is how many piece you want ==>In this case 2 pieces
        String[] wordsArray2 = sentence.split(" ",2);
        System.out.println("wordsArray2 = " + Arrays.toString(wordsArray2) );
        System.out.println("wordsArray size= "+wordsArray2.length);

        System.out.println("\t");
        //Limit is how many piece you want ==>>in this case 3 pieces
        String[] wordsArray3 = sentence.split(" ",3);
        System.out.println("wordsArray3 = " + Arrays.toString(wordsArray3) );
        System.out.println("wordsArray size= "+wordsArray3.length);

        System.out.println("\t");
        String car = "Lexus-IS-F";
        //.split : split from - and give me each pieces
        String[] carSplit = car.split("-");
        System.out.println(Arrays.toString(carSplit));
        System.out.println(carSplit.length);

        System.out.println("\t");
        //.split("-",2): split from "-" but make just 2 pieces. Start splitting from first "-" but don't split from all the "-" if it makes more than 2 pieces. So it just break apart from first "-"
        String[] carSplit2 = car.split("-",2);
        System.out.println(Arrays.toString(carSplit2));
        System.out.println(carSplit2.length);

        System.out.println("\t");
        //split("-",3); split from "-" and gets 3 pieces
        String car2 = "Lexus-IS-F-N-T";
        String[] carSplit3 = car2.split("-",3);
        System.out.println(Arrays.toString(carSplit3));
        System.out.println(carSplit3.length);


    }
}
