package test;
import java.util.Scanner;
public class condingbat_delDel {
    public static void main(String[] args) {
       //TASK IF STRING STARTS WITH A VOWEL RETURN TRUE
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //if( str.charAt(0)=='a')
        if( str.charAt(0)=='a'|| str.charAt(0)=='e'|| str.charAt(0)=='i'|| str.charAt(0)=='o'||str.charAt(0)=='u') {
            System.out.println("it starts w a vowel");
        }else
            System.out.println("no vowel at the beginning");

    }
//        System.out.println(startOz("ozymandias"));
//        System.out.println(startOz("bzoo"));
//        System.out.println(startOz("oxx"));
//    }
//
//        public static String startOz(String str) {
//            String result ="";
//            if(str.length()>=2 && str.substring(0).equals("o")&&str.substring(1).equals("z") )
//                result+= str.substring(0)+str.substring(1);
//            else if( str.length()>=1 && str.substring(0).equals("o") ){
//                result+= str.substring(0);
//            }else if( str.length()>=2 && str.substring(1).equals("z") ){
//                result +=  str.substring(1);
//            }
//            return result;
//        }


//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//       if ( str.substring(1, 4).equals( "del" ) ) {
//           System.out.println( str.substring(0,1) + str.substring(4) );
//       }else
//           System.out.println( str );
//    }
}
