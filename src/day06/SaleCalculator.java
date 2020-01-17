package day06;

        import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the regular price: ");
        double regularPrice = scan.nextDouble();

        System.out.print("What is the discount percentage: ");
        double disPercentage = scan.nextDouble();

        double salePrice = regularPrice-(regularPrice*disPercentage);

        System.out.println("Regular price is " +regularPrice+ " , discount is "+ disPercentage +" and you get deal "+ salePrice);


    }

}
