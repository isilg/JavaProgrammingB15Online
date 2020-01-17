package day21;

public class Get_N_Character_Of_A_String {
    public static void main(String[] args) {

        //FORMULA TO GET N CHARACTER OF A WORD. N COULD BE ANY NUMBER, 4 OR 5 OR 6

        String msg = "Hello World";
        int n=4;

        for(int i =0; i<msg.length()-n; i++){
            System.out.println(msg.substring(i, i+n));

        }
    }
}
