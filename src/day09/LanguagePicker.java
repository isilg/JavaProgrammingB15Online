package day09;

public class LanguagePicker {
    public static void main(String[] args) {

           int languageOption= 5;
           String greeting="";

           if (languageOption==1){
               greeting="Hello";
           }else if (languageOption==2){
               greeting= "Salam";
           }else if (languageOption==3){
               greeting= "Hola";
           }else if (languageOption==4){
               greeting= "Privet";
           }else if (languageOption==5){
               greeting= "Merhaba";
           }else if (languageOption==6){
               greeting= "Szia";
           }else if (languageOption==7){
               greeting= "bonjour";
           }else {
               System.out.println("it is not an option");
           }
        System.out.println(greeting);
    }
}
