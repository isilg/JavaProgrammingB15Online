package day21;

public class Search_3_Character_Inside_A_String {
    public static void main(String[] args) {

        //FORMULA GIBI OGREN, 3 ERLI CHARACTER ARIYORSAN LENGTH-3
        //SEARCH "UND"
        String name = "Isil Avunduk";

        for(int i=0; i<name.length()-3; i++){
            String current3Chars = name.substring(i,i+3); //son dongu: (10,12) 12 dahil degil 10 ve 11. character ler alincak
            if (current3Chars.equalsIgnoreCase("und")) {
                System.out.println("The index of \"und\" is: "+ i);
            }
        }

    }
}
