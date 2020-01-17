package day25;
public class Find_Longest_Word_In_A_Sentence {
    public static void main(String[] args) {

        String sentence = "I love coding nonstop";

        String[] eachWord = sentence.split(" ");

        String longestWord = eachWord[0];
        for (String currentWord : eachWord){
            if( currentWord.length() > longestWord.length() ){  //currentWord:We, sonra are, sonra trying....
                longestWord = currentWord;
            }
        }
        System.out.println("Longest word: " + longestWord);

    }
}
