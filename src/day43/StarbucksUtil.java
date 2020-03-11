package day43;
public class StarbucksUtil {
    public static void main(String[] args) {

      Coffee c = new Coffee("Blonde", 5, 1.6);
      printCoffeeInfo(c);        // It expect a Coffee object so I need to create
                                 // a coffee object before this line and pass it as a parameter here

    // Call printStringInfo() method
        String myString = new String("Hello");
        printStringInfo(myString);

        Coffee c1 =  new Coffee();
        printCoffeeInfo(c1);



    }


    // Create a static method to accept a coffee object and print it's info
    // like this: This coffee is: name, price is <price>, caffeine level is <level>

    // ********  Why static? => I can directly call them *********  => We can create an object. Type this
    // method name and give that object name as a parameter of this method so we will call
    // If we don't type static (If a method is not static) => It is an INSTANCE METHOD
    // TO CALL INSTANCE METHOD:
    // We had to create an object of current class       => StarbucksUtil util = new StarbucksUtil();
    // Then we would use that object to call the method  => util.printStringInfo(myString)
    // METHOD STATIC ISE  => ONCE  => String myString = new String("Hello");
    //                       SONRA => printStringInfo(myString);


//    public void printStringInfo(String str) {     // STATIC YAZMADIGIM ICIN INSTANCE METHOD OLDU
//        System.out.println("First character is: "+  str.charAt(0) );
//        System.out.println("Last character is: "  + str.charAt( str.length()-1) );
//    }




    public static void printCoffeeInfo(Coffee co){
        System.out.println( "This coffee is: "    +  co.getType() );
        System.out.println( "Price is: "          +  co.getPrice() );
        System.out.println( "Caffeine level is: " +  co.getCaffeineLevel() );
    }

    /** Create a static method to print out first and last character of a String
     */

    public static void printStringInfo(String str){

        // Where charAt() and length() methods are coming => String class indan
        System.out.println("First character is: "+  str.charAt(0) );
        System.out.println("Last character is: "  + str.charAt( str.length()-1) );
    }


}
