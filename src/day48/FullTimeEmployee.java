package day48;

public class FullTimeEmployee extends Employee {

    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Full time Employee Yearly: "+(monthlySalary*12));
    }

    @Override
    public String toString() {
        return "Full time Employee{"+"monthly salary= "+monthlySalary+" name= "
                +name+" id= "+id+ "Yearly salary= "+(monthlySalary*12);
    }
}
