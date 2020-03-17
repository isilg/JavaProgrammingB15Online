package day50;

public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";  //setting default value to avoid null. Not a good idea but we did it!


    abstract void calculate();

    //Constructor
    public Question(String questionType, String operator){
        this.questionType = questionType;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "The question type is "+questionType;
    }
}
