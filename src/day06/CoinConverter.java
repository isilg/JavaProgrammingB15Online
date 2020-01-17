package day06;

public class CoinConverter {
    public static void main(String[] args) {

        // you have 200 cent
        // how many quarter you can get
        // how many dime you can get (10 c)
        // how many nickel you can get (5 c)
        // how many penny you can get

        int cent = 200 ;

        // you have purchased candle for 0.74 cent
        // what would be your remainder

        cent -= 74 ;   // 126 cent after spending 74 cent for candle
        int quarter = cent / 25 ;
        int penny = cent % 25; //126/25 -> 5 , 1 is remaining

        System.out.println( quarter );
        System.out.println( penny );

        int dime = cent / 10 ;   // --->126 / 10 ->12
        //how much penny I have after getting dime 126 % 10 =>6
        int penny2 = cent % 10 ;
        System.out.println( dime );
        System.out.println( penny2 );

    }
}
