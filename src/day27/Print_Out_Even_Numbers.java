package day27;

public class Print_Out_Even_Numbers {
    public static void main(String[] args) {

        int[][] ages ={ {10}, {12,13,14,16,17}, {19,20,21,22,23} };
        //index:         0          1                 3
        //index:         0     0  1   3  4  5     0  1  2  3  4

        for(int i=0; i<ages.length; i++){
            for(int j=0; j<ages[i].length; j++){
                if(ages[i][j]%2==0){
                    System.out.print(ages[i][j]+" ");
                }
            }
        }

    }
}
