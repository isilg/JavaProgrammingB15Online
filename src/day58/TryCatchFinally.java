package day58;
public class TryCatchFinally {

    public static void main(String[] args) {

//        System.out.println("Before try catch");
//        try{
//            System.out.println("Hello from try block");
//            String str = null;       //null means not pointing any object
//            System.out.println(str.length());    //it cause NullPointerException cause there is no string, it is null
//        }catch (Exception e){
//            System.out.println("Exception happened and caught");
//        }
//        System.out.println("After try catch");



        System.out.println("Before try catch");
        try{
            System.out.println("Hello from try block");
            String str = null;       //null means not pointing any object
            System.out.println(str.length());    //it cause NullPointerException cause there is no string, it is null
        }catch (Exception e){
            System.out.println("Exception happened and caught");
        }finally {
            System.out.println("Finally block. Runs even if there is exception or not exception");
        }

    }
}
