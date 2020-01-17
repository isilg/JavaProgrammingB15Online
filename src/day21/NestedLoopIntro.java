package day21;

public class NestedLoopIntro {
    public static void main(String[] args) {

        //COUNT 1 TO 5, 3 TIMES

        for (int i=1; i<=3; i++){
            System.out.println("ITERATION : " + i);
            for (int x=1; x<=5; x++){
                System.out.print(x+" ");
            }
            System.out.println();  //iteration 1 yazip altina 1 2 3 4 5 yazdiktan sonra
                                   // 5 in yanina iteration:2 yazmaya basliyo hemen, inside for
                                   //loop bitince outside for a tekrar gecmeden once bu line a
                                   //gelcek o yuzden bu line i yazip asagi aldik
        }
    }
}
