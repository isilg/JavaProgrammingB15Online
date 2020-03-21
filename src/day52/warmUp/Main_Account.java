package day52.warmUp;

import day52.warmUp.Account;

public class Main_Account {

    public static void main(String[] args) {

        //Instantiate : creating an object of a specific class
         Account a1 = new Account("John" , 1000);
         Account a2 = new Account("Hanah", 7000);
         Account a3 = new Account("Katie", 5000);

        System.out.println("Before doing any transfer a1: "+a1+ ", a2: "+a3);
        a3.transferSome(a1, 1000);
        System.out.println("After getting some money a3 to a1, a1's account: "+ a1+" a2's account: "+a3);

        System.out.println("-------");
        System.out.println("Before transfer John's bank account John has: "+ a1.getBalance()+ ", Hannah has: "+a2.getBalance());
        //transfer a1's acc to a2
        a1.transferAll(a2);
        System.out.println("After transferring John's money to Hannah: "+a1 + a2);

        System.out.println("------------");
        //transfer a2's acc to a1
        a2.transferAll(a1);
        System.out.println("After transferring John's money to Hannah: "+a1 + a2);

        System.out.println("----------");
        a1.deposit(5000);
        System.out.println("Deposit 5000 to a1 "+a1);
        a1.withdraw(2000);
        System.out.println("Withdraw 2000 to a1 "+a1);

        System.out.println("----------");
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a3));
        System.out.println(a2.compareTo(a3));

        System.out.println("-----------");
        System.out.println("Does a1 has palindrome name: " + a1.isPalindrome());
        System.out.println("Does a2 has palindrome name: " + a2.isPalindrome());


    }
}
