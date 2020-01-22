package day33;
public class Name_Speller {
    /**
     * Create a method called getSpelledName
     * This method will put dash in between given String
     * For example  : Isil -->> I-s-i-l
     * @param name  : this is the name parameter
     * @return name : name has dash in between will return
     */

    public static void main(String[] args) {
        //Method return not print on the screen
        System.out.println( getSpelledName("Isil") );

        String spelledName = getSpelledName("Avunduk");
        System.out.println("Spelled name is: "+ spelledName);

        System.out.println( getSpelledName2("Hello") );
    }

    //I accept a String and return a String so I give return type as String
    public static String getSpelledName(String name){
        String result = "";
        for ( int i=0; i<name.length(); i++ ){
            if( i != name.length()-1) {
                result += name.charAt(i)+"-";
            }else
                result += name.charAt(name.length()-1) ;
        }
           return result;
    }


    // II.WAY ADD DASH BETWEEN THE CHARACTERS
    // TILL LAST CHARACTER AND AT THE END
    // CONCATENATE THE LAST CHARACTER

    public static String getSpelledName2(String name){
        String result = "";
        for (int i=0; i<name.length()-1 ; i++){
            result += name.charAt(i)+"-";
        }
        return result + name.charAt(name.length()-1);
    }


}
