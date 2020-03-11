package day39;
public class StudentCreation {
    public static void main(String[] args) {

        // ****** (Class name that I am going to use its attributes) (object name) = new kywrd) (Class name that I am going to use its attributes with parenthesis)
        // THE CLASS IM GONNA USE ITS ATTRIBUTES HAS NO MAIN METHOD BUT OTHER CLASS HAS !!!

        // How do we CREATE an OBJECT OUT OF TEMPLATE:
        // Class_name  object_name = new_keyword  Class_name();
        // Class_name become a data type.
        // Here Student is the data type just like String, int or double

        // SET the VALUES for s1 object attribute
        // name, age , and gender are ATTRIBUTES/ PROPERTY NAMES of any type of Student object
        Student s1 = new Student();
        s1.name = "Karima";
        s1.age = 18;
        s1.gender = 'F';

        // GET the VALUES for s1 object attribute
        System.out.println("s1 name: " + s1.name);

        Student s2 = new Student();
        s2.name = "Juma";
        s2.age = 31;
        s2.gender = 'M';

        System.out.println("s2 age " + s2.age);

        // I want to save Juma's age before I change so I still have access
        int oldAge = s2.age;

        s2.age = 28;
        System.out.println(s2.name + " | " + s2.age + " | " + s2.gender);

        // If I use s2 to bring info about
        // Output will be  day39.Student@404b9385
        // So don't use s2 ,  use  => s2.name or s2.age
        // System.out.println(s2);

        System.out.println("Juma's old Age = " + oldAge);
        // tell me the different between old age and new age

        System.out.println("The difference is " + (oldAge - s2.age));

/**
 Variable types :
 according to what kind of data it store :
 primitive variable -->> pure value
 reference variable -->> anything not primitive value is reference variable.
 It is the location of your object
 The pointer to the object in the heap
 Or we can say the address of the object in the heap.
 It is like a remote of the TV or a leash of the dog
 according to the location :
 inside method  --> we call it LOCAL VARIABLE
 inside parenthesis of method header  (inside  () ) -->> METHOD PARAMETER
 outside method inside class --> We call it Field. Field is another type of variable
 There are 2 type of fields: 1-Instance field/Instance variable
 like age and name. Instance field and instance variable are same thing 2-Static field
 In the example below: Local variables are => We dont have any method besides main method
 so look at the main method -> s1 , s2, and old age
 Primitive variable => Old age
 Reference variable => s1 and s2 because they are not primitive. Anything not
 primitive it is reference variable. It store address of the object.
 Or we can say it has the pointer of the object
 */


 }

}
