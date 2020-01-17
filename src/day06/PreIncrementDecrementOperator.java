package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {

        int offerCount = 2 ;
        ++offerCount ;  // ++offerCount;  means  offerCount = offerCount+1 ;
        System.out.println("Offer Now after increasing by 1 " + offerCount);

        --offerCount ;
        System.out.println("Offer Now decreasing by 1 "+ offerCount);

    }
}
