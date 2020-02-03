package day35;
public class Character_isDigit_Class {
    public static void main(String[] args) {
        // TASK: Get the numbers out of this String
        // and store it into Integer variable num.
        // HINT: Character.isDigit()-> Class check
        // each character if they are digit(number) or not

        String str = "A34B123C4X";
        String returnInt = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                returnInt += str.charAt(i);
            }
        }
        // Soruda number lari String den al ve
        // store it into Integer variable num diyor
        Integer num = Integer.valueOf(returnInt);
        System.out.println(num);


        // TASK 2: GET THE SUM OF THE NUMBERS INSIDE A STRING
        // One of the Approaches: for each char in String check if it is number.
        // If yes, store it in a String and use that String to
        // get Integer then sum it up
        // I could use for each loop to check each character if they are digit.
        // First converts the given string into a sequence of characters by using toCharArray() kullanarak

        // How to convert a character to int?
        // EX/ myChar = '7';
        // Way 1: Character.toString(myChar);
        // Way 2: String.valueOf(myChar);
        // Way 3: Integer.parseInt(myChar + ""); -> myChar DOESNT WORK ATTEMPT EMPTY STRING
        // parseInt accepts a String. You cannot pass a character into a method that accepts
        // String so in order to get a String we can just add an empty String to get a String

        //Eger String i int e ceviriyorsan Integer.parseInt()
        //Char i int e ceviriyorsan, asagidaki gibi, empty string ekle ->Integer.parseInt(each+"");
        char[] AllChars = str.toCharArray();   //AllChars -->> A34B123C4X
        int sum = 0;

        for( char each : AllChars ){
           if ( Character.isDigit(each) ){
              int eachNum = Integer.parseInt(each+"");
                sum+=eachNum;
            }
        }
        System.out.println(sum);
    }
}