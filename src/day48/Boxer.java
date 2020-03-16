package day48;

public interface Boxer {
    public default void read(){
        System.out.println("ONLY DEFAULT METHOD CAN HAVE BODY IN INTERFACE");
    }
    public static void study(){
        System.out.println("what r u studying?");
    }
}
