package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {



        byte letterCount = 26;

        System.out.println(("The letter count is " + letterCount));

        short sheepCount = 300;

        int catCount = 20;

        long mileToMoon = 500000l;    //sonda l var. Small or capital doesnt matter but we need to type d or D for double

        long mileToSun = 1000000L;     //sonda L var

        System.out.println("Sheep count is: " + sheepCount +","+ " Cat count is: "+  catCount + ","+ " Mile to Moon is : " + mileToMoon+","+ " Mile to Sun is: "+mileToSun);


        //----------floating point--------
        //you must add f at the end of number to indicate this is float data type
        //uppercase lowercase does not matter, but it is mandatory

        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49f;

        //---- larger floating point numbers ------

        double priceOfIpad1 =  355.99d;
        double priceOfIpadPro = 1024.990D;

        //compiler automatically assumes it's a double so it's not required to have d
        //However for good programming







    }
}
