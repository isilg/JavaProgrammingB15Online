package day50;

public class Subtraction extends Question {

    //int num1 and num2 will be assigned by user
    public Subtraction(int num1, int num2) {
        super("subtraction", "-");
//        this.num1=num1;
//        this.num2=num2;

        if (num2>num1){
            int temp = num1; //temp holds num1
            num1 = num2;     //temp holds num1, num1 holds num2
            num2 = temp;     //in the last case temp holds num1 so num2= holds means num2 will be holding num1
        }
        //after making sure num1 is more than num2 then we set the field value
         this.num1 = num1;
         this.num2 = num2;

    }

    //if num2>num1 -> assign num1 to num2 and assign num2 to num1
    @Override
    void calculate() {
        answer = num1 - num2;
        calculated = true;  //this.calculated = true;
    }

    //***CALLING toString METHOD OF SUPER CLASS -->> super.toString()
    @Override
    public String toString() {
        if (calculated==true){
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }
    }
  }
