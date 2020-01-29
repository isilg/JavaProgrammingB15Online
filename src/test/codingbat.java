package test;
public class codingbat {
    public static void main(String[] args) {


        String str = "Onder Girin";
        for(int i=0; i<str.length(); i+=3){
            System.out.println( str.charAt(i) );
        }



//        System.out.println( sumDouble(1, 2) );
//        System.out.println( sumDouble(2, 2) );
//    }
//
//        public static int sumDouble(int a, int b) {
//        int sum=a+b;
//            if(a != b)
//                return sum;
//            else
//                return 2*sum;
//
//
//    }
        String ID = "FB-457";
        String[] splitID = ID.split("-");
        System.out.println(splitID[1]);
//      int number = Integer.parseInt(splitID[1]);
//      System.out.println(number);

        String twoNumbers = "100,600";
        String[] arr = twoNumbers.split(",");
        int part1= Integer.parseInt( arr[0] );
        int part2 = Integer.parseInt( arr[1] );
        System.out.println(  part1+part2 );
    }


//    /**
//     * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//     * sameFirstLast([1, 2, 3]) → false
//     * sameFirstLast([1, 2, 3, 1]) → true
//     * sameFirstLast([1, 2, 1]) → true
//     * @param args
//     */
//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3};
//        System.out.println( sameFirstLast( arr1 ) );
//
//        int[] arr2 = {1,2,3,1};
//        System.out.println( sameFirstLast( arr2 ) );
//    }
//    public static boolean sameFirstLast(int[] nums) {
//        if(nums.length>=1 && nums[0]==nums[nums.length-1] ){
//            return true;
//        }else
//            return false;

    }

