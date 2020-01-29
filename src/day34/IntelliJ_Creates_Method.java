package day34;
public class IntelliJ_Creates_Method {
    public static void main(String[] args) {

        // ******* I have a login1 method but if I declare it like that
        // It gives error. Hover over the method name, login1, it shows
        // create method login1. Click it. IntelliJ creates is automatically *****
        loginVoid("my username" , "abc123");
        loginVoid("user", "abc123");

        boolean result = loginReturn("user","abc123");
        System.out.println("result = "+ result);

        System.out.println("second run "+ loginReturn("aaa", "bbb"));

        // System.out.println( loginVoid("aaaa", "bbb") );  //CAN NOT DO IT WITH VOID METHOD
        // boolean result2 = loginVoid("abc", "efg");       //NO RESULT TO SAVE!

        // I CAN CALL MY METHOD INSIDE IF
        if ( loginReturn("user1", "abc123") ) {
            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The order ");
        } else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN!!!!!!");
        }

    }
        private static void loginVoid(String user, String password) {
           if (user.equals("user") && password.equals("abc123")){
               System.out.println("Login Successful");
           }else
               System.out.println("Login failed");
        }

         private static boolean loginReturn(String user, String password) {
            return user.equals("user") && password.equals("abc123");
        }
    }