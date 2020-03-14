package day48;

//This class to run the HourlyEmployee class.
public class HourlyEmployee_FullTimeEmployee_Main {

    public static void main(String[] args) {

        //We cannot create object of abstract class
        //Employee e1 = new Employee();  //ERROR

        HourlyEmployee e1 = new HourlyEmployee("Max", 101, 55, 2000);
        e1.calculateAnnualSalary();
        System.out.println(e1);

        HourlyEmployee e2 = new HourlyEmployee("Kylie", 102, 57, 2080);
        e2.calculateAnnualSalary();
        System.out.println(e2);


        FullTimeEmployee f1 = new FullTimeEmployee("Jax ", 103, 6000);
        f1.calculateAnnualSalary();
        System.out.println(f1);

    }

}
