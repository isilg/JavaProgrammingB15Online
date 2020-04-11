package day57;
public class Exception_Example {
    public static void main(String[] args) {

        System.out.println("Hello B15!");
        //int num =2.5;  -->COMPILE ERROR EXCEPTION
        int[] nums = new int[3];
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
        //nums[3] = 200;  ->  It will be fine compiler dont check red squiggly. NO COMPILER ERROR.
                              //COMPILER CHECK Array name is right, square, bracket,
                              //equal sign etc. It will be problem after we run the code

        nums[10] = 100;

        System.out.println("Bye bye B15!");   //After we run the code this line will print out?
                                              //And line 8 will print out?
                                              //Line 8 will print out after that Exception will be thrown
                                              //ArrayIndexOfBounds we get then nothing will be printed
                                              //After exception nothing will be printed. line 19 won't print


        int[] nums2 = {34,12,5};
        System.out.println(nums[3]);    //COMPILER DOESN'T CHECK IF THERE IS ANY ELEMENT AT INDEX 3
                                        //SO IT IS NOT COMPILER ERROR AND IT WILL COMPILE SUCCESSFULLY.
                                        //AFTER WE RUN THE CODE WE'LL GET ARRAYINDEXOUTOFBOUND EXCEPTION

        //What kind of error is this?
        //int num = 2.5;     //Compile error. It is not exception.

        int result = 10/0 ;    //Is it compile issue? -> No compiler error. We get ArithmeticException exception
        System.out.println("result is: "+result);

    }

}
