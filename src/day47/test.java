package day47;
//test -> sub class of ExtremeSport & ExtremeSport sub class of Sport
public class test extends ExtremeSport {
    @Override
    public void doSomethingElse() {
        super.doSomethingElse();
    }

   //It came from Sport class, this class' grandparent class!!!
    @Override
    public void hi() {
        super.hi();
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.doSomethingElse();
        t1.hi();
    }
}
