package day07;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first name, last name, company seperated by space : ");
        String fName, lName, company, email;
        fName = s.next();
        lName = s.next();
        company =s.next();
        email = fName + "_"+lName+"@"+company+".com";
        System.out.println("My name is "+fName+lName+" and I work for "+company+" and my email is "+email);


//  II.Way
//        String fName = "Isil";
//        String lName = "Avunduk";
//        String company= "Amazon";
//        String email = fName+"_"+lName+"@"+company+".com";
//        System.out.println("My name is "+fName+" "+lName+" and I work for "+company+" my email is "+email);


    }
}
