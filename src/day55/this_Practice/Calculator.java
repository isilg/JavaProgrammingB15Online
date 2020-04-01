package day55.this_Practice;

public class Calculator {

    int result;


    public  Calculator minusNum(int num){
        this.result -= num;
        return this;
    }

    public Calculator addNum(int num){
        this.result += num;   //This here is c1. Whatever c1 is pointing to
        return this;
    }


    //instance method
    public void displayFinalResult(){
        System.out.println("final result = "+result);
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        //c1.addNum(100);
        //System.out.println(c1.result);

        //we can keep calling the method with the same object
        c1.addNum(100).addNum(200).addNum(100);
        System.out.println("c1: "+c1.result);

        System.out.println("___________");

        //Method chaining(builder pattern). One object is calling multiple methods at the same time called builder pattern
        c1.addNum(100).addNum(200).addNum(100).minusNum(50).displayFinalResult();

    }

}
