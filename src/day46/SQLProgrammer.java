package day46;

public class SQLProgrammer extends Programmer {

    //access modifier in subclass can have same visibility or
    //more visibility. What is more than default -> protected or public(public is the most visible)
    //If you try private gives error that you can't make it less visible
    @Override //@Override called annotation
    void code() {  //protected void code()
        System.out.println("WRITING SQL QUERY");
    }


    //Parent's test method private why it doesn't give error? Because they are
    //different methods that have same name. Private anything cannot be inherited
    //If I remove comment line before @Override it gives error right away that
    //you cannot Override because you cannot inherited this private method

    //@Override
    void test() {
        System.out.println("TESTING SQL QUERY");
    }

    public void writeSQLQuery(){
        System.out.println("WRITING MY SQL QUERIES ");
    }
}
