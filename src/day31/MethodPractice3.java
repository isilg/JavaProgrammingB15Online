package day31;
public class MethodPractice3 {

    //CREATE A METHOD TO COUNT 20 TO 1
    public static void countDownFrom20tillOne(){
        for(int i=20; i>0; i--){
            System.out.print(i+" ");
        }
        System.out.println(""); // EMPTY LINE. IF WE CALL THIS METHOD TWICE OR
                                // IF I CALL ANOTHER METHOD AFTER THIS ONE,
                                // IT WILL PRINT TO NEXT LINE.
    }

    //CREATE A METHOD TO COUNT ODD NUMBERS 1 TO 100
    public static void printOddNumbers1to100() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }


    public static void name(){
        String[] name = {"I","s","i","l"};

        for(String eachLetter: name){
            if(eachLetter != name[name.length-1]) {
                System.out.print(eachLetter+"-");
            }else
                System.out.println(eachLetter);
        }
        System.out.println("");
    }


    static public void main(String[] args){
        countDownFrom20tillOne();
        printOddNumbers1to100();
        name();
    }
}
