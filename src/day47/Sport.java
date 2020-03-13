package day47;
public class Sport {

    public final void doSomething(){
        //final method cannot be overridden by sub class
        //We can still use it but as is without overriding!!
        System.out.println("Doing regular sport");
    }

    public void doSomethingElse(){
        System.out.println("sth else");
    }

    public void hi(){
        System.out.println("Im not static so you can override me!");
    }

    public static void notInherited(){
        System.out.println("Im static so you cannot override me!");
    }

}
