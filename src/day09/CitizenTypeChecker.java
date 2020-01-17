package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {

        String cityzenType;
        int age=70;

        if(age > 65){
             cityzenType = "Senior";

        }else {
            cityzenType = "Not senior";
        }
            System.out.println(cityzenType);

    }

}
