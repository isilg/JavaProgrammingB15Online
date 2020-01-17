package day17;

public class WakeUp_NameCorrector {
    public static void main(String[] args) {


        String name = "Isil";
        int x = name.length()-1;

        while (x>=0) {
            System.out.print("index "+ x+ " : ");
            System.out.println(name.charAt(x));
            --x;

        }

    }
}
