package day47;
public class ExtremeSport extends Sport {

    int x;

    @Override
    public void doSomethingElse() {
        System.out.println("Doing sth else");
        super.doSomething();  // I can use this method but cannot override!
    }

    public static void main(String[] args) {
        ExtremeSport e1 = new ExtremeSport();
        e1.doSomethingElse();
       //super.doSomething();  //ERROR.Main method is static means belong
                               //to class. Static cannot access to super
        e1.differencePrivateAndFinal(10);
        e1.differencePrivateAndFinal();  //I call not inherit final method
        e1.difPrivateAndFinal();    //I call not inherit private method
    }


    public void differencePrivateAndFinal(int n){
        System.out.println("I have the same method name with a final parent" +
                           " method but since I have different argument list" +
                           " there is no error, otherwise it gives error.");
    }

    public void difPrivateAndFinal(){
        System.out.println("I have same name with a private parent class method" +
                           " but we are not related because I don't even see it, since it is private");
    }


//    @Override    -> ERROR. cannot override static method!
//    public static void hi() {
//        System.out.println("cannot override static method!");
//    }

    /**
     * Whenever a method is declared as static then we should keep in mind these points:
     *    A static method belongs to the class rather than object of a class.
     *    A static method can be invoked without the need for creating an instance of a class.
     *    Static method can access static data member and can change the value of it.
     * Now, this keyword in java is a reference variable that refers to the current object.
     * Also the super keyword in java is a reference variable which is used to refer immediate
     * parent class object. So, we can say that this and super both keyword are reference variable
     * that refers to some object. In other words these both keywords belong to instance of the class.
     * Whereas, static method belongs to the class than instance of the class. And so static method
     * can’t access this and super keyword in java.
     */


}