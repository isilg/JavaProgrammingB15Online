package office_hour;

public class Practice_12_02 {
    public static void main(String[] args) {

        String item = "Echo Dot (3rd Gen) Charcoal";
        //get whatever is inside paranthesis()
        //Find out index of  9  and index of ) ,  use them for substring to get the text

        // System.out.println( item.substring( 9, 18) );
        // System.out.println( item.substring( 10, 17));

        int indexOfOpeningParanthesis = item.indexOf (" ( ");
        int indexOfEndingParanthesis = item.indexOf( " ) ");

        String wordInsiderParanthesis = item.substring(indexOfOpeningParanthesis+1, indexOfEndingParanthesis);
        System.out.println("wordInsiderParanthesis = " + wordInsiderParanthesis);


    }
}
