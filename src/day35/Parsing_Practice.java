package day35;
public class Parsing_Practice {
    public static void main(String[] args) {

        // CALCULATE PRICE OF YOUR GROCERY FROM THIS SENTENCE
        String sentence = "I bought 3 tomato and the price was 3.14 each";
        // HOW MUCH IS YOUR FINAL CHECKOUT PRICE
        // HINT: THE COUNT IS ALWAYS 3RD WORD
        // THE PRICE IS ALWAYS AT 2ND WORD FROM THE LAST

        String[] allWords = sentence.split(" ");
        int count = Integer.parseInt(allWords[2]);
        double price = Double.parseDouble(allWords[allWords.length - 2]);
        System.out.println("Total price is: " + count*price);


        // TASK:  String sentence = "I bought 3 tomato and the price was 3,14 each";
        // 3.14 degil 3,14  oldugu icin hata veriyor onu once noktaya cevirip sonra ayni islemi yapman gerekirse

        String sentence2 = "I bought 3 tomato and the price was 3,14 each";
        String[] allWords2 = sentence2.split(" ");

        int count2 = Integer.parseInt(allWords[2]);

        String priceString = allWords2[allWords2.length-2];
               priceString = priceString.replace(",",".");
        double price2= Double.parseDouble(priceString);
        System.out.println("Total price is: "+count2*price2);
    }

}
