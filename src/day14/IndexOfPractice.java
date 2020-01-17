package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        // find out index of another String inside our String which is "Game of Java"
        // find out the location of Java
        // find out the location of letter o
        // find out the location of first space


        String name = "Game of Java";        // length is 12 , last char index is 11


        System.out.print("find out the location of Java: ");
        System.out.println(name.indexOf("Java"));  //starts from 0 and count till it find J for Java and returns 8

        System.out.print("find out the location of o: ");
        System.out.println(name.indexOf("o"));      // if the location is not found , we get minus number

        System.out.print("find out the location of uppercase O: ");
        System.out.println(name.indexOf("O"));

        System.out.print("find out the location of first space: ");   // It always gives up first occurance so it prints out the first space
        System.out.println(name.indexOf(" "));

    }
}
