package day32;
public class MethodWithReturnData_2 {
    public static void main(String[] args) {
        System.out.println( divide(10,3) );
        System.out.println( divide(10,0) );
        System.out.println( divide(0,10) );
    }

    public static double divide(double num1, double num2){
        if(num2==0){
            return 0.0 ;
        }else {
            return num1/num2;
        }
    }

}
