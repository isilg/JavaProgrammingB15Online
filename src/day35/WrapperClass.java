package day35;
public class WrapperClass {
    /**
     * Wrapper class: Group of class specifically designed
     * to turn primitive value into an object
     */
    public static void main(String[] args) {

        // PRIMARY REASON OF WRAPPER CLASS IS YOU CAN GET AN OBJECT
        // OUT OF PRIMITIVE DATA. IT MEANS YOU CAN TURN A PRIMITIVE DATA INTO AN OBJECT

        int x1 = 10;
        // primitive data types are just value that has no attribute or no behaviour
        // each primitive type has wrapper class that turn it into object so we can
        // treat it as object

        // THIS IS NOT AN INT VALUE IT IS AN INTEGER OBJECT
        // USING NEW KYWRD IS THE OLD NOT RECOMMENDED WAY OF CREATING AN INTEGER OBJECT
        // Integer obj1 = new Integer(12);

        Integer x2 = Integer.valueOf(10);
        Integer x3 = Integer.valueOf("10");

        // IF I TYPE X.  IT DOESN'T GIVE ANYTHING CAUSE IT IS JUST A DATA
        // IF I TYPE obj2. IT GIVES BUNCH OF METHOD


        // Integer.valueOf -->> GIVES INTEGER OBJECT
        // .byteValue() -->> TURN TO INTEGER OBJECT TO BYTE VALUE
        byte bValue = x2.byteValue();
        System.out.println("byte value= "+ bValue);

        //TURN AN INTEGER OBJECT TO DOUBLE
        double dValue = x2.doubleValue();
        System.out.println("double Value = "+dValue);

    }
}
