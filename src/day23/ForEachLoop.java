package day23;

public class ForEachLoop {
    public static void main(String[] args) {


        double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

        //RETURN EACH ELEMENTS WITH FOR LOOP
        //iter+Enter  ->> Short cut for foreach loop

        for ( int i=0; i < prices.length; i++){
            System.out.println( prices[i] );
        }


        System.out.println();

        //!!!!!!!!!!!!!!!!!  FOR EACH LOOP CAN ONLY BE USED FOR ARRAYS  !!!!!!!!!!!!!!!!!!!!!!!!!
        //!!!! THERE IS NO INFINITE LOOP IN FOR EACH LOOP
        // RETURN EACH ELEMENTS WITH FOR EACH LOOP
        for ( double eachPrice : prices){
            System.out.println("Each price: " + eachPrice);
        }



    }
}
