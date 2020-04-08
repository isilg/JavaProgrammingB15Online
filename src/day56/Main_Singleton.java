package day56;
public class Main_Singleton {
    public static void main(String[] args) {

    //How do you call getInstance() -->> since it is an instance
    //method I use its class' name to call it: Singleton.getInstance()
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3= Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
     //at the beginning we don't have an object. It was created.
     //and when we call later on we already have our object so
     //it returned "We already have this object"


        System.out.println("s1 is equal to 2?: " + (s1==s2));
        System.out.println("s2 is equal to 3?: " + (s2==s3));
        System.out.println("s3 is equal to 4?: " + (s3==s4));
        System.out.println("s4 is equal to 1?: " + (s4==s1));

     //We have 1 object and so s1,s2,s3,s4 point the same address

    }
}
