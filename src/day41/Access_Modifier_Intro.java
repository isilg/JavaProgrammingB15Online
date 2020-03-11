package day41;
import day40.BankAccount;
public class Access_Modifier_Intro {
    /**
     * Access modofoers can be used for fields and methods.
     * If there is no access modifier in front of method or field
     * it means it has default access modifier. This will make the
     * method of the field only accessible within the same package
     * public  -->> accessible anywhere
     * default -->> accessible within the same package. Use it for field or method!!..
     * private -->> accessible only within the same class
     */

    public static void main(String[] args) {

        // Using BankAccount from day40
        // I can reach to showAccountBalance(); method by using b1 object
        // It is different package how can I use it.
        // BECAUSE IT IS PUBLIC!!
        BankAccount b1 = new BankAccount();
        b1.showAccountBalance();
        // b1.balance = 1000;  // ERROR!!
                               // IF I GIVE PUBLIC ACCESS MODIFIER IN FRONT OF THE
                               // double balance;  LIKE  public double balance;
                               // THEN I DON'T GET ERROR


        Person p1 = new Person();
      // BECAUSE THESES ATTRIBUTES ARE PRIVATE, IT GIVES ERROR TO USE THEM
      // p1.name = "Ella";
      // p1.age = 19;
      // p1.ssn = 123456789;


        p1.setAll("Ella", 38, 123456789);
        System.out.println("p1= "+p1);


        System.out.println("Name= " + p1.getName());


        p1.setName("Victoria");
        System.out.println( "New name= "+p1.getName() );


        p1.setName("Scarlett");
        //  System.out.println(p1) dersem tum bilgileri dondurur sadece isim dondurmek istiyorum o yuzden getName() method i kullandim
        System.out.println(p1.getName());


        p1.setAge(39);
        p1.setSsn(987654321);


        int scarlettAge = p1.getAge();
        System.out.println("scarlett's age= "+ scarlettAge);

        System.out.println(p1);


    }
}
