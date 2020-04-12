package day58;
import java.io.IOException;
import java.nio.*;   //it is a package name. It is used to open file and stuff
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundException {
    public static void main(String[] args) throws Exception{

        System.out.println("Before Try catch");
        Files.readAllLines(Paths.get("file.txt"));


        //try catch statement
//        try {
//            Files.readAllLines(Paths.get("file.txt"));      //This line checks exceptions. It is reading a file called file.txt.
//                                                                 //We don't have that file in our project. This is why we get exception.
//                                                                 //There is no file but we assume there is. If we say readAllLines, it
//                                                                 //throws exception. Don't worry about the code just know that it throws exception
//        }catch (IOException e) {    //If we hover over the readAllLines compiler shows: Unhandled exception: java.io.IOException
//            System.out.println("Exception happened and caught! ");
//        }


        System.out.println("After try catch");
    }
}
