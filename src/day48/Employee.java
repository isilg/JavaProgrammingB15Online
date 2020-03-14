package day48;

public abstract class Employee {

    String name;
    int id;

    //Empty constructor
    public Employee(){
    }

    //WHY WE CREATE THIS CONSTRUCTOR, WE CANNOT CREATE AN OBJECT OF IT
    //BECAUSE SUBCLASS CAN REUSE THE CODE OF SETTING NAME AND ID
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Abstract method doesn't have body
    public abstract void calculateAnnualSalary();

    public abstract String toString();
}
