package taskChannel;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

//        Create a String array of 6 items to store groceryItems  {"apple","banana","grape","strawberry","blueberry","kiwi"}
//        Create a float array of 6 float values to store prices  { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
//        assume that the order of grocery Items match the prices in same order.
//        1. loop through each grocery items and print them in one line with arrow and do not put arrow after last one
//        1.1 print each items at odd index
//        1.2 print all items in reverse order
//        1.3 find out the index location of strawberry
//        1.4 find out the count of groceries that contains berry in the name
//        1.5 print out all the character counts of the grocery items
//        1.6 print out only those items with even character count
//        1.7 print out only those items end with letter e
//        1.8 print out only last 3 characters of all the items
//        1.9 create String variable called allItems and store all the items inside array separated by comma.
//        2 loop through each prices  and print them in one line
//        2.1 print each prices in even index
//        2.2 print only prices less that 3 dollars
//        2.3 print the sum of all the prices and get average
//        2.4 print only the second half of prices (last 3)
//        2.5 print the sum of the middle two prices
//        2.6 print only prices more than average price
//        2.7 find out max price and print out max price and  index of max price
//        2.8 find out the minimum price and index of minimum price
//        2.9 find out second max price and index(challenging)
//        3 assume that the order of grocery Items match the prices in same order do below:
//        3.1 print first item and first price in one print statement -->>  apple price is 1.99
//        3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
//        3.2 print all items and prices in one for loop together
//        3.3 print only those items with price more than 3.11
//        3.4 print only those items with price more than average
//        3.5 print only those prices of grocery items that contains letter b
//        3.6 print the item name with max price
//        3.7 print the item name with min price
//        4  Below tasks will modify array :  (for each loop should not be used, try and see why)
//        4.1 swap the value of first item in array with last item of array , swap apple with kiwi
//        4.2 use for loop to loop through your groceryItems array and modify your items like this :
//        itemValue+itemCharacterCount
//        For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}
//        4.3 increase the value of each prices by one  in prices array
//        4.4 double the value of each prices in your array 1.99-->> 1.99*2
//        4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3
//        4.6 now find out highest price after the modification
//        4.7 find out the most expensive item name


        String[] grocery = {"apple","banana","grape","strawberry","blueberry","kiwi"};

//        //1.
//        //I. WAY
//        System.out.print(Arrays.toString(grocery));
//
//        //II.WAY
//        System.out.println();
//        for( String eachItem : grocery){
//            System.out.print(eachItem+" ");
//        }

        //1.1
        // System.out.println(grocery.length-1);   ---->> INDEX NO
        // System.out.println( grocery[grocery.length-1] );   --->> [grocery.length-1] last item NAME

//        for (String eachItem : grocery){
//            System.out.print(eachItem);
//            if( !eachItem.equals( grocery[grocery.length-1] )){
//                System.out.print("-->");
//            }
//        }


    }
}
