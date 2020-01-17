package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {

        String message = "   REPL IS COMING !  ";

        System.out.println(message);
        System.out.println("Message character counter is: "+ message.length());

        System.out.println("\t");

        //TRIM() METHOD TAKE OUT ALL THE SPACE BOTH AT THE BEGINNING AND AT THE END. BUT DOES NOT EFFECT THE SPACE THAT INSIDE THE STRING.
        System.out.println( message.trim() );
        System.out.println("Without spaces message character counter is: " + (message.trim()).length());

        System.out.println( message.isEmpty() );
    }
}
