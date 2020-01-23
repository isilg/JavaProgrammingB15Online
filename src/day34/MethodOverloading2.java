package day34;
public class MethodOverloading2 {
    /**
     * create 4 static void overloaded version of add method
     * 	1th add
     * 		has 1 int parameter and add 100 to that number
     * 		and print out the result
     * 	2th add
     * 		has 2 int parameters and add them to get sum
     * 		and print out the result
     * 	3th add
     * 		has 3 int parameters and add them to get sum
     * 		and print out the result
     * 	4th add
     * 		has 2 long parameters and add them to get sum
     * 		and print out the result
     */
    public static void main(String[] args) {
        add(10);
        add(10,20);
        add(10,20,30);
        add(10l,20l);
    }

    public static void add(int n1){
        System.out.println(n1+100);
    }

    public static void add(int n1, int n2){
        System.out.println(n1+n2);
    }

    public static void add(int n1, int n2, int n3){
        System.out.println(n1+n2+n3);
    }

    public static void add(long l1, long l2){
        System.out.println(l1+l2);
    }


}
