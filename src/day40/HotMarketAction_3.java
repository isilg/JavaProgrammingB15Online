package day40;
public class HotMarketAction_3 {
    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;


     // Objeyi String type inde dondurmek gerek kural olarak ama o1 i
     // print etmek istersen sadece adini yazman yeterli. Cunku
     // Offer Class inda toString method tanimladik. It will be called
     // automatically. String type olmadan objeyi donduremeyiz hash code doner

     // ******* BURDA toString method CALLED BY COMPILE **********

        System.out.println("Without toString method :" + o1);

     // *******BURDA toString method CALLED BY EXPLICITLY (I SEE IT IS HERE, I WRITE IT) **********
        System.out.println("\t");
        String o1Str = o1.toString();
        System.out.println("With toString method: " + o1Str);   // System.out.println( "o1Str: " + o1.toString() );



    }
}
