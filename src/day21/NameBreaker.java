package day21;

public class NameBreaker {
    public static void main(String[] args) {

        //loop through each letter and if you see 'v' get out of the loop
        String name = "Isil Avunduk";


        for ( int i = 0; i < name.length() ; i++){

            if ( name.charAt(i) == 'v'||name.charAt(i) == 'V'){
                break;
            }
              System.out.println(name.charAt(i));
            }

        //II.WAY
        System.out.println("\t");
        for (int i =0; i<name.length(); i++){
            if( ( name.substring(i,i+1).equalsIgnoreCase("v") ) ){
                System.out.println("found v");
                break;
            }

        System.out.println(name.substring(i, i+1));
        }
    }
}
