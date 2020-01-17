package day08;

import org.w3c.dom.ls.LSOutput;

public class ifElseStatement {
    public static void main(String[] args) {


    int speedLimit = 60;
    int yourCurrentSpeed = 45;

    boolean IamSpeeding = yourCurrentSpeed > speedLimit ;

    if( yourCurrentSpeed > speedLimit  ){
        System.out.println("get pulled over by the police");
        System.out.println("given ticket by the police");
    }

    else

    {
        System.out.println("go shopping !!");
        System.out.println("Buy Ice cream");
    }

 }

}