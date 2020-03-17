package day50;
public class Addition extends Question {

    //int num1 and num2 will be assigned by user
    public Addition(int num1, int num2){
        super("addition", "+");
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    void calculate() {
        answer = num1+num2;
      //calculate = true is ok also cause if we don't like that there is no confusion
        this.calculated = true; //if u come to this point, it means you called the
                              //calculate method to calculate the result otherwise
                              //it will return false by default
    }

    @Override
    public String toString() {
        //***SUBCLASS CALLING SUPERCLASS' toString() METHOD-->>super.toString()
        if(calculated==true){
            return super.toString() + num1+operator+num2+ "=" +answer;
        }else{
            return super.toString() + num1+ operator+num2+ "=" ;
        }
    }
}
