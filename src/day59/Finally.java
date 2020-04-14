package day59;

public class Finally {
    public static void main(String[] args) {


        // IF I HAVE A BLOCK OF CODE I WANT IT TO RUN EVEN THERE IS EXCEPTION OR NOT
        int[] nums = {1, 2, 4};

        try {
            System.out.println("nums[5] = " + nums[5]);
        } catch (Exception e) {
            System.out.println("There is no index more than" + (nums.length-1));
        } finally {
            System.out.println("This code will always run either we have exception or not");
        }

    }
    
}
