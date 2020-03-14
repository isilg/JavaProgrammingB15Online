package day48;

public class HourlyEmployee extends Employee{

    double hourlyWage;
    int numsOfHours;

    public HourlyEmployee(double hourlyWage, int numsOfHours){
        super("John", 123456);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }

    @Override
    public void calculateAnnualSalary(){
        System.out.println("Yearly Annual Salary: " +hourlyWage * numsOfHours );
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
