package day07;

public class Casting {
    public static void main(String[] args) {

        // int num = 10 ;
        //int 10 is implicitly(implicitly means automatically) converted to double 10.0
        //and stored inside bigNum behind scene

        double bigNum = 10;
        System.out.println(bigNum);

        //12.99 is double, double has much bigger range than int
        //so it just does not fit
        //int num = 12.99;  this gives error

        int num = (int) 12.99;  //BU TEXT IN UZERINE GELINCE Cast to int' diye bisey cikiyo mavi renkli o sana donusum konusunda yardim ediyo, onu tikla
        System.out.println(num); //int noktadan sonrasini dondurmez, 12 donecek!


        //create a long variable and store int
        long a = 123l;
        int b = (int) a;
        System.out.println(b);

        //create an int variable and try to store above long value

    }
}
