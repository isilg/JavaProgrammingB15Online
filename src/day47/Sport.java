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

    final void differencePrivateAndFinal(){
        System.out.println("Im a final method so subclass cannot inherit me and" +
                            " also cannot even have a method same name with this method");
    }

    private void difPrivateAndFinal(){
        System.out.println("Im a private method subclass cannot inherit me but it can have same name with this method");
    }


}
