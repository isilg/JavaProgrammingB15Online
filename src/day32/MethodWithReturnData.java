package day32;
public class MethodWithReturnData {
    public static void main(String[] args) {

        // If you type giveMeMyName(), it returns nothing because
        // return does not show anything on the screen
        // We need to use System.out.println();
        String name = giveMeMyName();
        System.out.println("name= " + name);

        System.out.println();
        int myResult = doubleTheNumber(10);
        System.out.println("myResult= " + myResult);

        System.out.println();
        System.out.println( doubleTheNumber(5) );

        System.out.println();
        System.out.println("add 14 to 16 Result =" +add2Numbers(14,16) );


//        int result = add_2Numbers(5,7);       //GIVES ERROR CAUSE
                                                //VOID PARAMETER CANNOT BE SAVED
//        int result2 = add2Numbers(14,16);     //OK
//        System.out.println(result);


    }

    // I want to create a method called giveMeMyName
    // It returns your name as a result
    // It has no parameter
    // Instead of void use String
    // Because you are gonna store your name in String variable
    public static String giveMeMyName () {
        return "Isil";
    }

    //create a static method doubleTheNumber that double the value of a number
    //It accepts one int parameter and return doubled value of that number
    // *************** WHOLE PURPOSE OF METHOD THAT RETURN A VALUE IS
    // WE CAN SAVE THE RESULT AND DO STH WITH IT ******************
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

    //********public static void add2Numbers(int num1, int num2)
    //deseydik ve main de
    public static void add_2Numbers(int num1, int num2){
        //return num1+num2;  ERROR. VOID RETURN YAPMIYOR
        System.out.println(num1+num2);
    }

  }

