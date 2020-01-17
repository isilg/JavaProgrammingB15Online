package day22;

import org.w3c.dom.ls.LSOutput;
import taskChannel.Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class LoopControlStatement {
    public static void main(String[] args) {

        //Loop through each and every letter
        //1- Print every other letter
        //2- When you reach letter 'a' break the loop
        //3- Break the loop when you see 3rd 'a' Case sensitive

        String msg = "I struggle with Java I love Java I love Java Everything is Awesome";


        for (int i = 0; i < msg.length(); i += 2) {
            System.out.print(msg.charAt(i));
        }
        System.out.println();
        //II.WAY
        for (int idx = 0; idx <msg.length() ; idx++) {
            if(idx %2 ==1) {  //if index is odd number don't take i
                continue;
            }
          System.out.println( "index "+ idx + " : " +msg.substring(idx,idx+1) );
        }


        System.out.println();
        for (int i=0; i<msg.length(); i++){
            if (msg.charAt(i) == 'a'){      //if( msg.substring(i, i+1).equalsIgnoreCase("a") )
                break;      //a gordugu anda donguden cikar ve kodu durdurur
            }
            System.out.print( msg.charAt(i) );
        }
        System.out.println();
        //BREAK YERINE BIDE CONTINUE ILE DENEYELIM
        for (int i=0; i<msg.length(); i++){
            if (msg.charAt(i)=='a'){      //if( msg.substring(i, i+1).equalsIgnoreCase("a") )
                continue;       //a lari atlayip yoluna msg nin sonuna kadar devam eder
            }
            System.out.print( msg.charAt(i) );
        }


//      Print after 3rd 'a'
//      Increase counter, when counter turn yo 3, break the loop


        System.out.println();
        System.out.println("=============");
        int second_A_Of_Index = msg.indexOf("a", msg.indexOf("a")+1);

        int third_A_Of_Index = msg.indexOf("a",second_A_Of_Index+1);

        System.out.println( msg.substring(third_A_Of_Index) );



        System.out.println();
        System.out.println("|||||||||||||||||||||||");

        int i=1;
        for(int x = 0; x<msg.length(); x++){
                if ( x == msg.indexOf("a") ) {
                    ++i;
                    if (i==3)
                        System.out.println( msg.substring(msg.charAt(x)) );
                        break;
                }
            }


        }

    }
