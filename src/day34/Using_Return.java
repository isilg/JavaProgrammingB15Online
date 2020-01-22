package day34;
public class Using_Return {
    public static void main(String[] args) {
        min4character("Jon");
        //min4character("John");
    }
    public static void min4character(String name){
        if(name.length() < 4){
            System.out.println("invalid name");
            //return;   //return kywrd is used to get out of the METHOD(try w it and without it)
        }

        System.out.println(name);
    }

}
