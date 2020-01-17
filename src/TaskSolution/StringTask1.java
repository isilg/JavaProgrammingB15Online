package TaskSolution;

public class StringTask1 {
    public static void main(String[] args) {

        //Given a String with any possible length, including 0,
        //print first 2 characters only.  If the String is empty print
        //Empty String. If it has 1 character, print that character twice
        //Ex/ "abcde"  -> ab
        //    "" -> Empty String
        //    "J" -> JJ

        String name = "Java";   //If string was  I am great ata Java"; it return I because I dan sonra space var onuda 1 character sayar

        if ( name.length() > 2){
            System.out.println( name.substring(0 , 2)  );
        }else if ( name.isEmpty() ){
            System.out.println("Empty String");
        }else{
            System.out.println( name.charAt(0)+ "" + name.charAt(0));
        }

    }
}
