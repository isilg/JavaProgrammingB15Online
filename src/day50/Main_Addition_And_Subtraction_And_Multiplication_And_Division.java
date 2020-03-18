package day50;

import java.util.Arrays;
import java.util.List;

public class Main_Addition_And_Subtraction_And_Multiplication_And_Division {

    public static void main(String[] args) {

        //Addition reference type(reference type=any type that is not primitive type)
        Addition q1 = new Addition(10, 90);
        System.out.println(q1);  //not calculated yet, just assign num1 and num2
        q1.calculate();
        System.out.println(q1);

        //Subtraction is reference type
        Subtraction q2 =  new Subtraction(90, 10);
        System.out.println(q2);
        q2.calculate();
        System.out.println(q2);

        Subtraction q3 =  new Subtraction(10, 90);
        System.out.println(q3);
        q3.calculate();
        System.out.println(q3);

        //m1 holds Multiplication object address, Multiplication is reference type
        Multiplication m1 = new Multiplication(10, 3);
        System.out.println(m1);
        m1.calculate();
        System.out.println(m1);

        Division q4 = new Division(10, 5);
        System.out.println(q4);
        q4.calculate();
        System.out.println(q4);

        Division q5 = new Division(10,50);
        System.out.println(q5);
        q5.calculate();
        System.out.println(q5);

        Division q6 = new Division(10, 0);
        System.out.println(q6);
        q6.calculate();
        System.out.println(q6);

        System.out.println(" ================== ");

        //If we want to store the results which are different type -> We use list
        //What is their type? --> All of them are Question
        List<Question> allTestQuestions = Arrays.asList(q1,q2,q3,q4,q5,q6);
        for( Question each: allTestQuestions){
            System.out.println("each question= "+each);
        }

    }

}
