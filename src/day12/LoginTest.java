package day12;

public class LoginTest {
    public static void main(String[] args) {

        String userName ="user123";
        String pass ="pass122";

        if (userName.equals("user123") && pass.equals("pass123")){
            System.out.println("login successfull");
            // !userName.equals("user123") means userName != ("user123") but
            // !=  DOES NOT GIVE CONSISTENT RESULT DON'T USE IT.  USE !....equals()
        }else if ( !userName.equals("user123") && pass.equals("pass123")){
            System.out.println("username is not correct");
        }else if(userName.equals("user123") && !pass.equals("pass123")) {
            System.out.println("password is not correct");
        }else
            System.out.println("username and password are wrong");
    }
}
