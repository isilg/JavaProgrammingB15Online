package day56;
public class Main {

    public static void main(String[] args) {

        //Create 3 product object. !EVEN 2 OF THE OBJECT HAS SAME VALUE, THEY ARE DIFFERENT OBJECT,
        //THEIR POINTER SHOW DIFFERENT ADDRESSES. THERE ARE 3 POINTER AND 3 OBJECTS
        Product p1 = new Product("Macbook PRO", 2999);
        Product p2 = new Product("Sony TV", 499);
        Product p3 = new Product("Sony TV", 499);

        System.out.println( "(p1==p2) p1 is equal to p2? : " + (p1==p2) );  //p1 and p2 are pointing the same object?  --> NO
        System.out.println( "(p2==p3) p2 is equal to p3? : " + (p2==p3) );  //p2 and p3 are pointing the same object?  --> NO
        System.out.println( "(p2==p2) p2 is equal to p2? : " + (p2==p2));


        //equals method coming from Object class. Product has extends Object so Product has equals method inherited
        //any class (abstract, interface, any class) that extends Object class can use its methods
        System.out.println("\nChecking equality by using equals method: \n ");
        //***RESULTS ARE DIFFERENT. USE EQUAL METHOD NOT ==

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        //************* Here it returns true because p2 and p3 have same content. How many object we have-> Look at the new keyword.
        //We have 2 different object but equals method check if they have same content *************
        System.out.println("p2.equals(p3): " + p2.equals(p3));
        System.out.println("p2.equals(p2): " + p2.equals(p2));


        Product p4 = p3;  //We have 4 pointers: p1,p2,p3,and p4, and we have 3 objects. p3 and p4 are pointing the same object now
        System.out.println("p4.equals(p3): " + p4.equals(p3));


        //If we compare Strings we can use equals method because String has override equal method already. (Coming from Object class)
        System.out.println("ABC".equals("ABC"));  //System.out.println("ABC".equals(new String("ABC")));



    }
}
