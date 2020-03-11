package day37;
public class Method_Overloading_With_Wrapper {
    public static void main(String[] args) {
        // If we dont specify the type of value
        // IntelliJ is automatically accept it as int not Integer
        printNum(100);  // it is accepted as int
        printNum(Integer.valueOf(100));
    }

    public static void printNum(Integer x){
        System.out.println("Print Integer Object x= "+x);
    }
    public static void printNum(int x){
        System.out.println("Print primitive int x= "+x);
    }
}
