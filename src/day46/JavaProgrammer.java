package day46;
public class JavaProgrammer extends Programmer{

    public static void main(String[] args) {
        JavaProgrammer j1 = new JavaProgrammer();
        j1.code();
        j1.test();
    }

    //Override parent's methods -> Generate -> Override methods
    @Override   //@Override called annotation
    void code() {
        System.out.println("IM CODING JAVA");
        //super.code();
    }

    @Override
    void test() {
        System.out.println("WE DO TEST IN JUnit!!");
        //super.test();
    }

    //You cannot Override sth you don't get!You can override only methods
    //you get from parent so don't override these below methods mistakenly
    public void drinkCoffee(){
        System.out.println("Drink lots of cup of joe");
    }


    public void doJavaDevelopment(){
        System.out.println("Doing Java Development!!");
    }

}
