package day59;
import java.io.IOException;
public class ThrowingException {
    public static void main(String[] args) throws IOException {

       // DIFFERENCE BETWEEN THROW AND THROWS- INTERVIEW
       // WHAT IS CHECKED AND UNCHECKED EXCEPTION  %100 INTERVIEW


        //Creating NullPointerException object
        NullPointerException e1 = new NullPointerException();

        //Creating another NullPointerException object
        NullPointerException e2 = new NullPointerException("NullPointerException object");
        System.out.println(e2.getMessage());   //print out the message we created on the top line
        throw e2;      //throw exception

    //Another way throw exception. We cant use together this one and throw e2. After line 13 this line will be unreachable
       //throw new NullPointerException("NullPointerException object");


//        IF IT IS ASKED, HOW DO U UNDERSTAND IF AN EXCEPTION IS CHECKED OR UNCHECKED:
//        I try to throw an exception, if it compile, it means it is RunTimeException. Use new kywrd and throw a message
//           Ex/ throw new NullPointerException("NullPointerException object");
//       output:  Exception in thread "main" java.lang.NullPointerException: NullPointerException object
//
//           Ex/ throw new Exception("just throwing this");   // giving red squiggly
//           Ex/ throw new IOException("just throwing this");   // giving red squiggly
//          What should do  -->>  put it in try catch block
//
//        try{
//            throw new IOException("just throwing this");
//        }catch(IOException e){
//            System.out.println("Exception caught");
//        }
//            OR
//      public static void main(String[] args) throws IOException{
//      }
//        String str = "abc";
//        System.out.println(str.charAt(10));
//        throw new IOException("IOException");

    }
}

