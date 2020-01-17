package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {


        int num = 300;

        if (num %3==0 && num%5==0){
            System.out.println("It is Fizz number");
        }else if (num % 5 == 0){
            System.out.println("It is Buzz number");
        }else if (num %3==0 )
            System.out.println("It is FizzBuzz number");
        else
            System.out.println("NOT MY NUMBER!!!");
    }
}
