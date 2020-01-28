package day14;
public class StringMethodCharAt {
    public static void main(String[] args) {

        //charAt method of String will return a character at certain location specified

        String name = "Isil";

        System.out.print(name.charAt(0));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(3));
        //System.out.println( name.charAt(4));  IF I WRITE THAT, IT GIVES STRING INDEX OUT OF BOUND

        System.out.println("\n");

        //ILK 2 HARF BOYLE CONCATENATION YAPILMAZ, SAYI DONER BOYLE
        //charAt kullanma, substring kullan
        //System.out.print(name.charAt(0)+name.charAt(1));
        System.out.println(name.substring(0, 2)+name.substring(0, 2)+name.substring(0, 2));


        System.out.println("\n");

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        System.out.println("\t");

        char c1 = name.charAt(0);
        char c2 = name.charAt(1);
        char c3 = name.charAt(2);
        char c4 = name.charAt(3);
        //System.out.println( c1+ c2+ c3+ c4 );     // IF YOU ADD A CHARACTER DIRECTLY, IT THINKS YOU ARE TRYING TO ADD ASCII CODE AS AN ARITHMETIC OPERATOR.  IT RETURNS ASCII CHARACTER
        System.out.println(c1+ " "+c2+" "+c3+ " "+c4);    //CHARACTER LARI DIRECTLY EKLEMEDIK ARAYA BOSLUK KOYDUK!!!!
    }
}
