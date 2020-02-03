package day36;
public class Review {
    public static void main(String[] args) {
    /**
    Primitive Types: Boolean, Byte, Character, Double, Float, Int, Long, Short
    These classes coming from java.lang package
    collectively called -->> Primitive Wrapper Classes
    It has a lot static methods built in theses classes to work with this type of data
    1. parse  -> String into primitive types value, converting String to int
	"123" ---> 123  Integer.parseInt("123");

    EX/ Integer.parseInt('9')
    THIS WILL NOT WORK!!! :
    parseMethod accept String, it will turn it into int
    passing character here('9' is a char not a String)!!! BAD IDEA!!!
    How to Covert Byte to int? Add an empty String:
    char myChar = '9' ;
    Integer.parseInt(myChar+"") -->> int 9
    Add an empty String. This is why I type (myChar+""). Empty String after myChar


    are character 9 and int 9 same thing????
    '9' == 9 -->>>  //FALSE  57==9
    "123" -->> 123L
     Long.parseLong("123")  --->> 123L

    IMPORTANT :
    ALL parseX method return primitive value

    2. Wrap up primitive value to create Object
    // Object oName = new Object();
    String str = new String("Happy New Year");
    int[] nums = new int[8];

    deprecated means : old way
    Integer i1 = new Integer(1230000); --> this is deprecated way
    recommended way (it is a method that return Integer):
    Integer i2 = Integer.valueOf(123);
     Integer.valueOf() ==>>  String ->Integer
     * */

    Integer i1 = new Integer(1000000000);
    Integer i2 = Integer.valueOf(123);


    // is i3 primitive type variable or reference type variable?
    // Anything is not primitive, it is a reference
    // type or class type an object type. It doesn't matter.
    // Anything that isn't primitive, it has its own class.
    // Integer is a class so it is a reference type
    // i3 is a reference type
    // Integer class is a wrapper class for the primitive type int which
    // contains several methods to effectively deal with a int value like
    // converting it to a string representation, and vice-versa.
    // An object of Integer class can hold a single int value.
    Integer i3 = 45;    //45 become new Integer-->> new Integer(45) ;

    int i4 = 54;
    // Auto boxing : primitive to wrapper type conversion
    // Auto unboxing : wrapper type to primitive type conversion
    int i5 = new Integer(100); // new Integer(100) -->> 100

    // AUTO BOXING AND UNBOXING IS UNIQUE FEATURE
    // OF CONVERSION BETWEEN PRIMITIVE VALUE WRAPPER CLASSES OBJECTS
        System.out.println(i1 + i2);

   }
}
