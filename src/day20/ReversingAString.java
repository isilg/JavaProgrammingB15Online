package day20;

public class ReversingAString {
    public static void main(String[] args) {

        //!!!!!!!!!!! COK ONEMLI INTERVIEW QUESTION  !!!!!!!!!!!!
        //Reverse A String

        String name = "Isil Avunduk";
        for (int x=name.length()-1; x>=0 ; x--){
            System.out.print( name.charAt(x) );

        }
    }
}
