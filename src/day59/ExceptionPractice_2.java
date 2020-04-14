package day59;

public class ExceptionPractice_2 {
    public static void main(String[] args) {

//        String str = null;
//        System.out.println(str.charAt(0));   //NullPointerException

//        System.out.println("The Start");
//        String str = null;
//
//        try{
//            System.out.println(str.charAt(0));
//            System.out.println("End of try");
//        }catch (NullPointerException e){
//            System.out.println("No object");
//        }
//
//        System.out.println("The End");


        System.out.println("The Start");
        String str = null;

        try{
            System.out.println(str.charAt(0));
            System.out.println("End of try");
        }catch (NullPointerException e){
            System.out.println("No object");
        }catch (Exception e){
            System.out.println("This is the rest of the exception");
        }

        System.out.println("The End");

    }
}
