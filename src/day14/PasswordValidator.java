package day14;

public class PasswordValidator {
    public static void main(String[] args) {

        //Password Validator
        //Minimum 8 Char, Max 16 Char.  It must contains  _ or $.  It must not contains space.  It must start Ab

        String passVal = "Isil Isil";
        boolean min8Max16 = passVal.length() > 8 && passVal.length() < 16;
        boolean mustContains_or$ = passVal.contains("_") || passVal.contains("$");
        boolean mustContainSpace = ! passVal.contains(" ");        //basindaki ! degil yani olumsuz anlami katiyo
        boolean mustStartsWithAb = passVal.startsWith("Ab");

        if (min8Max16 && mustContains_or$ && mustContainSpace && mustStartsWithAb) {
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
}
