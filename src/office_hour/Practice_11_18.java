package office_hour;

public class Practice_11_18 {
    public static void main(String[] args) {

        //Relational Operator = Comparasion Operator :   < , > ,< =,  >=

        //==  !==   checking for equality and inequality


        //casting : converting one type to another
        // upcasting |type widening. Converting data with smaller range data type to bigger range data
        // downcasting | type narrowing. Converting data with bigger range data type to smaller range data.
               // for example double to int or long to short. This must happen explicitly(by user) or IT WILL NOT COMPILE
               // int priceAsWholeNumber = 99.45; ERROR
               // int priceAsWholeNumber = (int) 99.45; //it prints 99, 0.45 is lost but we are okay with that


        double price = 99;
        long earthToKrypton = 1500;
        System.out.println(price);
        System.out.println(earthToKrypton);

        //Special case of char to int.  Each character is represented by  numbers in ascii table

        char myLetter = 'A';
        System.out.println(myLetter);

        int myLetter2 = 'A';
        System.out.println(myLetter2);//int only store number so here it turns the character into ascii code number



    }
}
