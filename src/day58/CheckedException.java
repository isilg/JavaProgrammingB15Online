package day58;

public class CheckedException {
    public static void main(String[] args) {

        System.out.println("Checked Exception in next line");
        try {
            Thread.sleep(1000);   //This line throws a CHECKED EXCEPTION called Interrupted Exception.
                                        //Interrupted Exception is a Checked Exception. CHECKED EXCEPTIONS
                                        //MUST BE Handled or Declared for the code to compile
                                        //Thread.sleep: It pauses code execution for given milliseconds
        }catch (InterruptedException e) {
            System.out.println("Exception was caught");
        }
        System.out.println("After thread.sleep");
      }

    }
}
