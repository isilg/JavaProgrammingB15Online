package day36;
public class Method_Practice {
    public static void main(String[] args) {
        checkIfStringHasNumber("abjk123zcs") ;
    }

    /**
     * Write a static method to accept a String and return Boolean
     * it should return true if the String contains at least one
     *
     * @param str
     * @return true Boolean Object if the String contains at least one number
     */

    public static Boolean checkIfStringHasNumber(String str){
      for(int i=0; i<str.length(); i++){
         if( Character.isDigit(str.charAt(i)) ){
            //burda System.out.print() kullanilmazsa main de kullanilmaliki ekranda biseyler dondurebilelim
             System.out.println("number found!");
             return true;
            }
        }
        System.out.println("There is no number");
        return false;
    }
}
