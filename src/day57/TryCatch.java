package day57;
public class TryCatch {
    public static void main(String[] args) {

        System.out.println("Before try catch: ");
        try {
            System.out.println("In try block");
            int result = 10 / 2;
            //int result = 10 / 0;   //10/0 is exception so lines after this line(inside try) doesn't run.
                                     //It jumps to the catch so if it was 10/0, line 11 doesn't run.
                                     //if there is no exception like here then it don't go to catch and
                                     //if there is print statement inside catch it wont print
            System.out.println("After 10/0 line");
        }catch(ArithmeticException e){    //e just a variable name. it is named e generally. We can name anything
                                          //Ex/ ArithmeticException problem, ArithmeticException ex
            System.out.println("Exception happened, and was handled!");
        }
        System.out.println("After try catch ");



        try{
            System.out.println("In second try block");
            String str = "java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch(Exception e){
            System.out.println("Exception happened in Try Block and handled");
        }
        System.out.println("After second try catch..");

    }
}
