package day50;

public class Multiplication extends Question{

    //Constructor
    public Multiplication(int num1, int num2) {
        super("multiplication", "*");
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    void calculate() {
        answer = num1 * num2;
        calculated = true;
    }

    @Override
    public String toString() {
        if(calculated==true) {
            return super.toString()+ num1+""+operator+""+num2+" = "+answer;
        }else{
            return super.toString()+ num1+""+operator+""+num2+" = ";
        }
    }
}
