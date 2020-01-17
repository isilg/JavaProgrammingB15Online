package day32;

public class MethodWithReturnData {
    public static void main(String[] args) {

        //If you type giveMeMyName(), it does return nothing because
        //return does not show anything on the screen we need to use
        // System.out.println();
        String name = giveMeMyName();
        System.out.println("name= " + name);


        System.out.println();
        int myResult = doubleTheNumber(10);
        System.out.println("myResult= " + myResult);

        System.out.println();
        System.out.println("add 14 to 16 Result =" +add2Numbers(14,16) );

    }
    //I want to create a method called giveMeMyName
    //It returns your name as a result
    //it has no parameters
    public static String giveMeMyName () {
        return "Isil";
    }

    //create a static method doubleTheNumber that double the value of a number
    //It accepts one int parameter and return doubled value of that number
    //whole purpose of writing a method that return a value
    //so we can save the result after calling the method
    //and use it somewhere else
    public static int doubleTheNumber(int num){
        System.out.println("I am going to double the value of "+num);
        int result = num*2;
        return result;
    }

    //create a method called add, accept 2 int parameter
    //and return the result as int
    public static int add2Numbers(int num1, int num2){
        //int sum=num1+num2;
        //return = sum;
        return num1+num2;
    }


}
