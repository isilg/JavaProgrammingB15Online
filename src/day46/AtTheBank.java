package day46;
public class AtTheBank {

    public static void main(String[] args) {
        //Did not use extends kywr. Created CheckingAccount object.
        //Eventhough I didnt create any method I used CheckingAccount's methods!!
        CheckingAccount acc1 = new CheckingAccount("Kate",54321,10000);
        acc1.deposit(100);
        System.out.println("acc1= "+acc1);
        acc1.deposit(5000);  //it gives additional $200 by requirement
        System.out.println("acc1= "+acc1);
        acc1.withdraw(5300);
        System.out.println("acc1= " + acc1);
    }
}
