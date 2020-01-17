package day26;

public class ArrayTask_NumberTest {
    public static void main(String[] args) {

        int[] scores = {156,101,76,187,87,110};

        //Create a variable called finalResult to store your result
        //of checking if every number in this array is more than 100 or not
        //if all numbers are more than 100 then make it yes, if not make it no

        String finalResult = "";

        //LOGIC 1 :
        //take each item check if it is more than 100, count.
        //In the end if count is more than 0, answer NO

        int cntLessThan100 = 0;
        for ( int eachNum :scores ){
            if(eachNum <= 100){
                System.out.println("eachNum = "+ eachNum);
                cntLessThan100 ++ ;
            }
        }
        System.out.println("count less than 100 = "+ cntLessThan100);

        if(cntLessThan100 > 0 ){
            finalResult = "Yes";
        }else {
            finalResult = "No";
        }
        System.out.println("Final Result: " + finalResult);



        //LOGIC 1.2
        //take each item check if it is more than 100, increase the count
        //in the end if count is equal to array item, count the finalResult Yes (finalResult = "yes");,
        //otherwise print no
        int cntMoreThan100 = 0;

        for(int eachNum : scores){
            if (eachNum > 100){
                ++cntLessThan100;
            }
        }
        System.out.println("cntLessThan100=" +cntLessThan100);
        if (cntMoreThan100 == scores.length){
            finalResult = "yes";
        }else {
            finalResult = "no";
        }
        System.out.println("finalResult= "+finalResult);


        //LOGIC 2 :
        /// Assume initial value for final Result is Yes
        // Check each item and
        // break as long as one number is less than 100  after assigning final result to NO
        // if we never go inside condition , the final result will remain YES
        int[] scores2 = {156, 101, 76, 187, 87, 110};
        int size = scores2.length;
        System.out.println("size = " + size);

        String finalResult2 = "YES";

        for (int eachNum : scores) {

            if (eachNum <= 100) {
                finalResult = "NO";
                break;
            }

        }
        System.out.println("finalResult = " + finalResult);


        //LOGIC 3:
        // minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO

        // LOGIC 4 :
        // find min number if min number more than 100 yes


    }
}
