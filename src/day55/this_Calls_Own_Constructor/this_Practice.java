package day55.this_Calls_Own_Constructor;
public class this_Practice {

    public this_Practice() {
       //super();     //WHEN U CREATE AN OBJECT NO ARG CONSTRUCTOR IS CALLED FIRST
                      //IF WE HAD SUPER-CLASS, WE'D CALL SUPER'S NO ARG CONSTRUCTOR BUT WE
                      //DON'T HAVE IT SO WE CALL OUR OWN NO ARG CONSTRUCTOR BY USING this()
        this(100);
        System.out.println("no arg constructor");
    }

    public this_Practice(int x){
        //this();   //IF I UNCOMMEND THIS LINE IT WILL BE INFINITE LOOP. THIS LINE WILL CALL NO-ARG CONST THEN NO-ARG WILL CALL THIS AND IT WILL CONTINUE FOREVER
                    //CONSTR. INSIDE THIS ONE. U CANNOT DO IT BOTH IT GIVES ERROR. EITHER LINE 9 OR 14, NOT BOTH
        System.out.println("1 arg constructor");
    }

    public this_Practice(String str){
        this();
        System.out.println("1 arg constructor with String "+str);
    }



    public static void main(String[] args) {

        //ORDER OF THE CODE WORKING:  25-7-9-15-18-7-10
        //Creating an object. Which constructor will be called -> no arg one(whatever
        //we write inside the no arg const, they will be printed)
        //this_Practice t1 = new this_Practice();

        this_Practice t2 = new this_Practice("Hey");


    }



}
