package day11;

public class StringEquality {
    public static void main(String[] args) {

        String name= "Isil";
        String name2 =  new String("Avunduk");
        String name3 = "Isil";

        System.out.println(name);
        System.out.println(name2);

        //Using methods
        System.out.println(name == name2);
        System.out.println(name == name3);


        //Using Equals Method
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
    }
}
