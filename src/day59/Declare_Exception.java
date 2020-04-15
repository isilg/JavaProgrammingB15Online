package day59;
import java.io.IOException;

public class Declare_Exception {
    public static void main(String[] args) throws IOException {

        playWithFire();

//        try{
//        playWithFire();
//        }catch (IOException e){
//            System.out.println("Exception is handled");
//        }
    }


    public static  void playWithFire() throws IOException{
        System.out.println("If you call this method, it will give exception\n" +
                                " so you will need to declare it (type throws IOException\n" +
                                " on the main line) or handle it buy using try catch block");
    }
}
