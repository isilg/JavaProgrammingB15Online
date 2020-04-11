package day58;
public class StackOverflowException {

    static int num = 0;
    public static void main(String[] args) {
        num++;
        System.out.println("num= "+num);
        //Call main method. Recursion method: Method calling itself
        main(null);    //it expects an array, we dont have an array so we can pass null

        //This will be repeated again and again after run the code: at day58.Exception.main(Exception.java:9)
        //It is called stack trace
    }
}
