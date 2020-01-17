package day06;

public class CompoundOperator {
    public static void main(String[] args) {


        //+=, -=, *=, /=, %=  are called shorthand operator or compound operator


        int studentOnline = 263 ;

        studentOnline += 5 ;    //studentOnline = studentOnline +5 ;
        System.out.println("5 people joined the class " + studentOnline);

        studentOnline -= 3 ;    //studentOnline = studentOnline - 3 ;
        System.out.println("3 people left the class "+studentOnline);

        studentOnline *= 2 ; //studentOnline = studentOnline * 2 ;
        System.out.println(studentOnline);

        studentOnline /= 3 ;    //studentOnline = studentOnline/3;
        System.out.println("the student dropped to 1/3: "+ studentOnline);

    }
}
