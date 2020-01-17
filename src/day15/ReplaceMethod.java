package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        //Replace() Method of the String

        String message = "I love Pumpkin , Pumpkin IS FUN!" ;
        message = message.replace("Pumpkin", "Java!");
        System.out.println(message);


        //Replace space from everywhere
        String message2 = "Happy Thanks Giving to All!!" ;
        message2 = message2.replace(" ", "");
        System.out.println(message2);

    }

}
