package day50;
public class Division extends Question{

    public Division(int num1, int num2){
        super("Division", "/");

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    void calculate(){
        if (num2 == 0) {
            answer = 0;
        } else {
            answer = num1 / num2;
        }
        calculated = true;
    }

    @Override
    public String toString(){
        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }
    }

}
