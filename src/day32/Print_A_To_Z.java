package day32;
import org.w3c.dom.ls.LSOutput;
import javax.swing.*;
public class Print_A_To_Z {
    public static void main(String[] args) {
        print_A_To_Z();
        System.out.println();
        print_Z_To_A();
        System.out.println();
        printAlphabetInRange('a', 'f');
        printAlphabetInRange('G', 'B');
        printAlphabetInRange('A', 'A');
        printAlphabetInRange('a', 'A');
    }

    //PRINT A TO Z
    //Since letters are char counter's type is char
    //I named the counter as iChar. It would be any name i, x, or iChar
    public static void print_A_To_Z(){
        for (char iChar = 'A'; iChar<='Z'; iChar++) {
            System.out.print(iChar + " ");
        }
    }

    //PRINT Z TO A
    public static void print_Z_To_A() {
        for (char i='Z'; i>='A'; i-- ){
            System.out.print(i+" ");
        }
    }

    public static void printAlphabetInRange(char beginning, char ending){
        if (beginning < ending){
            System.out.print("We need to increment from "+beginning+ " till "+ending+"\t");
            for (char i=beginning; i<=ending; i++){
                System.out.print(i+" ");
            }
            System.out.println();

        }else if(beginning > ending){
            System.out.print("We need to decrement from "+beginning+ " till " +ending+"\t");
            for (char i=beginning; i>=ending; i--){
                System.out.print(i+" ");
            }
            System.out.println();

        }else
            System.out.print("They are same character");
    }
}
