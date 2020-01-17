package day25;

import java.util.Arrays;

public class How_Many_a_Inside_Char_Array {
    public static void main(String[] args) {

        String name = "Isil avunduk";
        //toCharArray() is a method of String that turns String into char Array
        //name.toCharArray() -->> name String ini al onu char Array e donustur
        //What .toCharArray() returns? -->It returns char Array object that has all the characters of the String object
        //yani String in tum character lerini alir char array inin icine atar ve dondurur

        //!!!!!!!***********!!!!!!!********* IMPORTAAAAAAANNNNNNNNNTTTTTTTTTTTTTTTT!!!!!!!!!!!!!!!!!!!!**************
        //NEDEN FOR EACH KULLANMADAN ONCE STRING I ARRAY E CEVIRDIK???????
        //CUNKU FOR EACH SADECE ARRAY LERE UYGULANIR

        char[] charName = name.toCharArray();
        //System.out.println( Arrays.toString(name.toCharArray()) );   //[I,s,i,l, , a,v,u,n,d,u,k]

        int count =0;
        for ( char eachLetter : charName ){

            //.equals String in ,method u eachLetter char old icin onu degil == i kullaniyoruz
            if(eachLetter == 'a'){
                ++count;
            }
        }
        System.out.println("How many 'a' are there inside the char Array "+count);


    }
}
