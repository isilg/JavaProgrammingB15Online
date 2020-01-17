package day23;

public class ForEach_FindSalary_MoreThan1000_And_MaxSalary {
    public static void main(String[] args) {

        //create a long array or 5 items called salaries use for each loop to iterate over them and print them out
        //OPTIONAL:use different for each loop to print only the salary more than 100000
        //OPTIONAL:use for each loop to find the max and use for each loop to find the sum

        long[] salaries = new long[]{10000L, 20000L, 30000L, 40000l, 50000l};   //L or l both works

        for (long eachSalary : salaries) {
            System.out.println("Each Salary = " + eachSalary);
        }


        System.out.println("\t");


        for (long highSalary : salaries) {

            if (highSalary > 100000) {
                System.out.println("High Salary = " + highSalary);
            }
            //II.WAY
            if (highSalary <= 10000) {  //if salary 10000 or equal to it dont get it, continue
                continue;
            }
            System.out.println("High Salary = " + highSalary);


            System.out.println("\t");

            long maxSalary = salaries[0];
            for (long salary : salaries) {
                    if (salary > maxSalary) {
                        maxSalary = salary;
                    }
            }
            System.out.println("Max Salary is: " + maxSalary);


        }
    }
}
