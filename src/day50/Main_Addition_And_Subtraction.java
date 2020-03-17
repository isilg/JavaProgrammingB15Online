package day50;
public class Main_Addition_And_Subtraction {

    public static void main(String[] args) {

        //Addition reference type(reference type=any type that is not primitive type)
        Addition a1 = new Addition(10, 90);
        System.out.println(a1);  //not calculated yet, just assign num1 and num2
        a1.calculate();
        System.out.println(a1);

        //Subtraction is reference type
        Subtraction s1 =  new Subtraction(90, 10);
        System.out.println(s1);
        s1.calculate();
        System.out.println(s1);

        Subtraction s2 =  new Subtraction(10, 90);
        System.out.println(s2);
        s2.calculate();
        System.out.println(s2);

        //m1 holds Multiplication object address, Multiplication is reference type
        Multiplication m1 = new Multiplication(10, 3);
        System.out.println(m1);
        m1.calculate();
        System.out.println(m1);

    }

}
