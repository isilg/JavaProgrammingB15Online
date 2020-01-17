package day06;

public class CompoundOperator3Remainder {
    public static void main(String[] args) {

        int bankBalance = 1140 ;

        System.out.println("I have spent the half of it: "+ bankBalance);
        bankBalance /= 2;    //bankBalance = bankBalance / 2;
        System.out.println("Now my balance is "+bankBalance);


        bankBalance %= 500 ;
        System.out.println("I want to divide the balance by 500 and keep the remainder in my pocket");
        System.out.println("The remainder is: "+ bankBalance);
    }
}

