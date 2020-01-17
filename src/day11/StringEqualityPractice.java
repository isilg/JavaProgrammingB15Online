package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

        //comparing 2 string literal directly using equals method
        System.out.println("Java".equals("java"));

        String myStr = "Java";

        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");

        System.out.println(("is my string same as your string?" ));

        // BOTTOM LINE IS : DO NOT EVER USE == TO CHECK STRING EQUALITY
    }
}
