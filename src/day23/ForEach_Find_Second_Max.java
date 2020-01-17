package day23;

public class ForEach_Find_Second_Max {
    public static void main(String[] args) {

        long[] salaries = new long[]{10000L, 20000L, 30000L, 40000l, 50000l};   //L or l both works

        long maxSalary = salaries[0];
        for (long salary : salaries) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        //2.nd max salary:

        for (int i=0; i<salaries.length; i++){
            long maxSalary2 =salaries[i];
            if (maxSalary2 < maxSalary && maxSalary2 > salaries[i]){
                System.out.println("Second max salary: " + maxSalary2);
            }
        }
    }
}