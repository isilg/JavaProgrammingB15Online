package day09;

public class LanguagePicker_With_SwitchStatement {
    public static void main(String[] args) {

        System.out.println("Enter your language option from 1 to 7");
        int languageOption= 5;
        String greeting = "";

        switch(languageOption){
            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting ="Salam";
                break;
            case 3:
                greeting = "Hola";
                break;
            case 4:
                greeting = "Privet";
                break;
            case 5:
                greeting = "Merhaba";
                break;
            case 6:
                greeting = "Szia";
                break;
            case 7:
                greeting = "bonjour";
                break;
            default:
            greeting = "it is not an option";
        }
        System.out.println(greeting);
    }
}
