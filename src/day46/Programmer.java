package day46;

//Programmer is a super class
//JavaProgrammer and SQLProgrammer are child classes
//Override code and test under subclasses

//JavaProgrammer
//   unique behaviour: drinkCoffee,  doJavaDevelopment
//SQLProgrammer
//   uniques behaviour: writeSQLQuery

//OVERRIDING IS UNIQUE FOR INSTANCE METHOD
//THERE IS NO CONCEPT OF OVERRIDING FOR ANYTHING OTHER THAN INSTANCE METHOD
public class Programmer {

    void code(){
        System.out.println("Any programmer code");
    }

    private void test(){
        System.out.println("Any programmer test");
    }

}
