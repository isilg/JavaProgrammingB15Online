package day48;

public class HourlyEmployee extends Employee{

    //String name;
    //int id;
    double hourlyWage;
    int numsOfHours;

    public HourlyEmployee(String name, int id, double hourlyWage, int numsOfHours){
        super(name, id);  //calling parent's  public Employee(String name, int id)
                           //method to set name and id variables.
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }

    @Override
    public void calculateAnnualSalary(){
        System.out.println("Yearly Annual Salary: " + (hourlyWage*numsOfHours) );
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", Yearly salary = "+(hourlyWage*numsOfHours)+
                '}';
    }
}
