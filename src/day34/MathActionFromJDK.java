package day34;
public class MathActionFromJDK {
    public static void main(String[] args) {

        // When I create a String variable where is String class coming from ?
        // it's coming from a package called java.lang
        // it's a special package
        // and any class in it ,does not need importing when being used
        // for example String class
        String str = "isil";

        // There is a class under java.lang called Math
        // and it has lots of math utility methods that ready to be used
        // Type Math. it will give you options to choose like
        // Math.addExact. Then u can assign it to a variable and return it
        //or can return it directly by using  System.out.print
        int sum = Math.addExact(10, 20);
        System.out.println("sum = " + sum);

        System.out.println("max of 10, 20 --> " + Math.max(10, 20));

    }
}