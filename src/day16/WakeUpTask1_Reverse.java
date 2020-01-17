package day16;

public class WakeUpTask1_Reverse {
    public static void main(String[] args) {

//        Given a word with 4 characters
//        stored in a String variable word1
//        create a String variable called word2
//        store the reversed word1 into word 2
//        and print out
//        FOR EXAMPLE :
//        word1 ==> Java    -->> word2 avaJ
//                -- optionally ask this word from scanner


        String word1 = "Java";
        String word2 = "";

        //word2 = ""+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        //word2 = word2+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        //word2 +=word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);  //bu sekilde farkli sonuc veriyo
        word2 +=word1.charAt(3)+""+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);

        System.out.println(word2);
        
        //Asagidaki code yukardakini kind of aciklamaya yardim ediyo
        String msg = "Hello";
        msg += "World!";
        System.out.println("msg = " + msg);
    }
}
