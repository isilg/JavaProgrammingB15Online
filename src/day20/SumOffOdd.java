package day20;

import org.w3c.dom.ls.LSOutput;

public class SumOffOdd {
    public static void main(String[] args) {


    //Find sum of odd numbers from 10 - 100, use loop
    //hint: create a variable sum as int loop thgrough 10-100
    //in each iteration check it's an even number or not
    //if it's add that number to sum

    int sum = 0;
    for(int x = 10; x<=100; x++)

        {
            if (x % 2 != 1) {
                sum = sum + x;
            }
        }
        System.out.println("sum = " + sum);

}

}
