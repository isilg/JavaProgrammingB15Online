package day58;
public class CheckedException {

    //THIS CODE IS DECLARED(USING THROWS EXCEPTION AFTER MAIN METHOD OR YOUR METHOD)
    public static void main(String[] args) throws Exception {   //if u wanna be more specific u can type throws InterruptedException
        System.out.println("Checked Exception in next line");
        Thread.sleep(1000);
        System.out.println("After Thread.sleep");



        //THIS CODE IS HANDLED
//        System.out.println("Checked Exception in next line");
//        try {
//            Thread.sleep(1000);   //This line throws a CHECKED EXCEPTION called Interrupted Exception.
//                                        //Interrupted Exception is a Checked Exception. CHECKED EXCEPTIONS
//                                        //MUST BE Handled or Declared for the code to compile
//                                        //Thread.sleep: It pauses code execution for given milliseconds
//        }catch (Exception e) {      //u can type InterruptedException e also but if u type Exception it will catch all of them
//            System.out.println("Exception was caught");
//        }
//        System.out.println("After Thread.sleep");
      }

    }
