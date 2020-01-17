package office_hour;

public class Practice_11_27 {
    public static void main(String[] args) {

        String message = " I LOVE  JAVA ";
       //trim -->> take out spaces at beginning and ending of a String object
        System.out.println("message = <" + message +">");
        String messageTrimmed = message.trim();
        System.out.println("messageTrimmed =<" + messageTrimmed+ ">");


        //IsEmpty -> checks whether a String object is empty ,  meaning there is nothing inside
        String emptySpaces = "     ";
        System.out.println("emptySpaces = <" + emptySpaces+">");


        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is : " + emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is emoty??? : " + emptySpacesAfterTrimmed.isEmpty());


        //isEmpty vs isBlank method from String class
        //isEmpty => yourString.length()>0 true, else it's false
        //isBlank => If you have only white spaces get true, else false

        System.out.println("emptySpaces is blank or not ?? : " +emptySpaces.isBlank());
        System.out.println("emptySpaces is blank or not ?? : " +emptySpaces.isEmpty());
        
        //indexOf --> give you location of the string you are looking for inside another string
        
        
        int locationOfLove = message.indexOf("LOVE");
        System.out.println("locationOfLove = " + locationOfLove);






    }
}
