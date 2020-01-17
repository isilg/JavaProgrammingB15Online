package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        //Create an int array of 7 item, assign values
        //1- print out in reverse order
        //2 - store last item in a variable called lastItem, print it out separately
        //3 - print the item right in the middle
        // OPTIONALLY :
        // find sum ,
        // find average ,
        // find max ,
        // find min,
        // double the value of each items in this array


        int[] num = {1, 2, 3, 4, 5, 6, 7};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

        //LAST ITEM
        System.out.print("\n");
        System.out.println(num[num.length - 1]);


        //item right in the middle
        System.out.println("Middle item is : " + num[num.length / 2]);

        System.out.println();
        //find sum
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("sum = " + sum);


        System.out.println();
        //FIND AVERAGE
        double average = sum / num.length;
        System.out.println("Average: " + average);


        System.out.println();
        //FIND MAX
        int max = num[0];
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("MAX NUMBER OF THE ARRAY: " + max);


        System.out.println();
        //FIND MIN
        int min = num[0];
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("MIN NUMBER : " + min);


        System.out.println();
        // double the value of each items in this array
        int i = 0;
        for (i = 0; i <= num.length - 1; i++) {
            num[i] = num[i] * 2;

            System.out.println("DOUBLED ARRAY IS: " + num[i]);
        }

    }
}