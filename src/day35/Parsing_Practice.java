package day35;

public class Parsing_Practice {

    // CALCULATE PRICE OF YOUR GROCERY FROM THIS SENTENCE
    String sentence = "I bought 3 tomato and the price was 3.14 each";
    // HOW MUCH IS YOUR FINAL CHECKOUT PRICE
    // HINT: THE COUNT IS ALWAYS 3RD WORD
    // THE PRICE IS ALWAYS AT 2ND WORD FROM THE LAST
    String[] splitSentence = sentence.split(" ");
    String thirdItem =  splitSentence[2] ;
    String secondFromLast = splitSentence[splitSentence.length-2] ;

        thirdItem.valueOf()*secondFromLast



}
