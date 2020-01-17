package day15;

public class NameChecker {
    public static void main(String[] args) {

        String name = "Isil";

        if ( name.length()  < 4 ){
            System.out.println("Short name");
        }else if( name.length() >=4  &&  name.length() <=11) { //1.000.000 greater than 4(true), less than 11? no(false). true || false->true  so domt use|| use &&
            System.out.println("Medium name");
        }else
            System.out.println("Longer name");


        if( name.contains("a") || name.contains("e") ){
            System.out.println("Name contains a or e");
        }else
            System.out.println("I don't have both a or e in my name");



    }
}
