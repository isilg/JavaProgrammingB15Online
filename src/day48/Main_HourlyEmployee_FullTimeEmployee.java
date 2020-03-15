package day48;

import java.util.Arrays;
import java.util.List;
//This class to run the HourlyEmployee class.
public class Main_HourlyEmployee_FullTimeEmployee {

    public static void main(String[] args) {

        //We cannot create object of abstract class
        //Employee e1 = new Employee();  //ERROR

        HourlyEmployee h1 = new HourlyEmployee("Max", 101, 55, 2000);
        h1.calculateAnnualSalary();
        System.out.println(h1);

        HourlyEmployee h2 = new HourlyEmployee("Kylie", 102, 57, 2080);
        h2.calculateAnnualSalary();
        System.out.println(h2);

        FullTimeEmployee f1 = new FullTimeEmployee("Jax ", 103, 6000);
        f1.calculateAnnualSalary();
        System.out.println(f1);


        Employee h3 = new HourlyEmployee("Katie",111,58,25000);
        h3.calculateAnnualSalary();
        System.out.println(h3);
        Employee f2 = new FullTimeEmployee("John",112,8000);
        h3.calculateAnnualSalary();
        System.out.println(f2);
        Employee f3 = new FullTimeEmployee("Katherina",113, 10000);

        //What's the easiest way to store these 3 objects ->Creating a list
        List<Employee> allEmployee = Arrays.asList(h3, f2, f3);

        for ( Employee each : allEmployee ){
            System.out.println("Name is: "+each.name);
            each.calculateAnnualSalary();
        }

    }

}
