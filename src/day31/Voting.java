package day31;

public class Voting {

    //IF AGE IS MORE THAN 18, THEY ARE ELIGIBLE TO VOTE
    public static void main(String[] args) {

        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(63);

        int yourAge = 12;
        checkEligibility(yourAge);

    }

    public static void checkEligibility(int age){

        if (age>18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible ");
        }
    }
}
