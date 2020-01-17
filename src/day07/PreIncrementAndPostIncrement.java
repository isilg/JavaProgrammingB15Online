package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        //increment apple
        int apple = 8;

        apple++;  //incrementing by 1
        System.out.println(apple);

        ++apple;  //increasing the value
        System.out.println(apple);

        //when ++ comes after the variable it's called post increment
        //it will increase the value BUT it will reflect the increased the value next time
        //the variable show up!(nest time derken System.out.println(apple); ile ekrando dondururken yani)
        //if ++ comes before, it increases right away. as soon as when we type ++apple, it will be increased

        int score = 50;
        System.out.println( ++score );
        System.out.println( score++ ); //51 AND READY TO BE 52 NEXT TIME IT SHOWS UP
        System.out.println(score); //NOW 52 OLDU, HICBI EKLEME CIKARMA YAPMADIK SADECE YUKARDA YAPMISTIK AMA ++ SCORE DAN SONRA OLD. ICIN SONRAKI SHOW UP'TA ARTTI

        System.out.println(--score);
        System.out.println( score--);
        System.out.println( score );

    }
}
