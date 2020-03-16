package day44;

// FIELDS ARE ALWAYS WRITTEN UNDER THE CLASS EITHER STATIC OR INSTANCE
// NAME, TYPE, COUNTER ARE OUR FIELDS
public class Course {

    // I wanna see as new courses created

    String name;
    String type;

    //static field
    static int counter;

    //Create constructor
    public Course(String name, String type){
        this.name = name;
        this.type = type;
        ++counter;   // I wanna see as new courses created by using counter
    }

    public void showCounter(){
        System.out.println("non-static method calling static field" +
                            "in the same class directly typing its name" +
                            "calling nonstatic method or field from another" +
                            " class is done same way->create an object->" +
                            "objectName.methodName or  objectName.fieldName"+counter);
    }

    public static void showCounter2(){
        System.out.println("static method calls static field" +
                           "in the same class directly typing its name " +
                           "but from different class-> thisClassName.staticFieldName," +
                           " calling static method from different class->" +
                           " is done by same way thisClassName.staticMethodName "+counter);
    }

}
