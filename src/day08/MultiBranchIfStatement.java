package day08;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        int currentSpeed = 80;
        int speedLimit = 60;


        if (currentSpeed >70) {
            System.out.println("you are speeding more than 70 -- points");
        }
        else if(currentSpeed <= 70 && currentSpeed >60) {
            System.out.println("your speed is more than or equal to 70 but more than60");

        }
        else
            System.out.println("Keep driving you r good");

    }
}
