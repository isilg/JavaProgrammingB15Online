package day25;
import java.util.Arrays;
public class String_Split_Method {
    public static void main(String[] args) {

        //Cumlede kac kelime var?
        String sentence = "I love Java";

        //.split method String i split yapar. Nereden split yapacaksan parantez icine yaz
        //Bosluktan ayirirsak kac kelime oldugunu buluruz
        String[] allWords = sentence.split(" ");

        System.out.println( "allWords = " + Arrays.toString(allWords) );
        System.out.println(allWords.length);  //Ne doner? Bosluktan ayirdik cumleyi-->> kac kelime oldugunun sayisi doner

        //Bu sekilde yazarsak ne doner?.......ASCII DONER......WHY?........
        //.split METHODU KULLANDIKTAN SONRA STRING ARRAY GIBI OLUR
        //HATTA String[] allWords = sentence.split(" ");  DEYIPTE STRING ARRAY DE SAVE YAPTIK.
        //ARRAY LER NASIL DONDURULUR EKRANA? -->> ARRAYS.TOSTRING ILE.  System.out.println(sentence.split(" "));
        //GET LAST WORD OF THE STRING. ELIMIZDE 3 KELIME OLDUGUNU BILIYORUZ, DONDURMUSTUK
        //3 ELEMAN VAR: 1-I 2-LOVE 3-JAVA  SON ELEMANI YANI LENGTH-1 DONDURURSEK NOLUR?
        //allWords.length-1  -->> 2,  allWords[allWords.length-1] -->>last word
        System.out.println( allWords [allWords.length-1] );

        //BOYLE YAZARSAK OUT OF ARRAY ERROR
        //System.out.println(allWords[allWords.length]);


        System.out.println();
        //Stringi e'den bol
        String sent = "I am very beautiful!!!";

        String[] split_By_e_Array = sent.split("e");

        for (String eachPieces : split_By_e_Array){
            System.out.println("Each Pieces = <"+ eachPieces+">");
        }

        //!!!AFTER SPLITING FROM e, EACH e WILL BE GONE

        //SPLIT SENT SENTENCE BY AM AND PRINT OUT YOUR RESULT

        String[] split_By_am = sent.split("am");

        for (String eachPieces : split_By_am){
            System.out.println("Each piece after splitting by am= <"+eachPieces+">");
        }

    }
}
