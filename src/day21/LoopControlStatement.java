package day21;

public class LoopControlStatement {
    public static void main(String[] args) {

        //fori + Enter  for loop shourtcut
        //When code reaches the continue, it will skip to the next iteration

        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 1){
                continue;   //continue skip to the next iteration AMA IF TEN CIKIP FOR A DEVAM ETMEZ FOR UN BASINA GERI DONER YANI I A YENI DEGERLER ATAMAYA DEVAM EDER. Check if the number is odd (%2==1),if it is odd, dont take it continue to the next iteration
            }
            System.out.println(i); // I TEKSE FOR UN BASINA GERI DONER, DEGILSE IF TEN CIKAR SAYIYI DONDURUR
        }

        for (int i = 0; i <= 5; i++) {

            if(i%5 ==0 ) {
                continue;   //CONTINUE BREAK GIBI KODU BITIRMEZ. BU KOD 6 KEZ DONER IF I 5'E BOLUNUYOSA IF IN ICINI YAPMAZ, IT JUST GET OUT OF IF BLOCK. AMA BREAK TE DIREK TUM KODU SONLANDIRIR
              //  System.out.println("I said Hellloooo");   //THIS LINE GIVES 'UNREACHABLE STATEMENT' ERROR
            }
            System.out.println("Yes"); // I TEKSE FOR UN BASINA GERI DONER, DEGILSE IF TEN CIKAR SAYIYI DONDURUR
        }


        System.out.println("====================");
        //When code reaches the break, it will get out of the loop

        for (int i = 1; i <10 ; i++) {
            System.out.println(i);
            break;  //AS SOON AS I SEE BREAK, I GET OUT OF THE LOOP. IT DOESNT MATTER IT STILL SATISFY THE CONDITION OR NOT
        }

        System.out.println("====================");

        //Count 1 to 10. If you reach 5 , get out of the loop
        //IF LINE CONTAINS BREAK, LOOP WILL STOP NO MATTER WHAT

        for(int i=1; i <=10; i++){
            System.out.println(i);
            if (i==5){
                break;
            }
        }

        System.out.println("====================");

        //Return sum of the numbers 1 to 10, if the sum more than 20 dont continue to add
        int sum = 0 ;
        for(int i =1; i<=10; i++) {
            if (sum+i > 20) {  //line 45(sum+=i) line 41 e yani for a doner ve i ekler so we need to check sum+=i here not just sum
                break;
            }
            sum += i;
        }
        System.out.println(sum);

    }
}
