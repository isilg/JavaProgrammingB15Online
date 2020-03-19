package day52;
public class Main_Account {

    public static void main(String[] args) {

         Account a1 = new Account("John" , 1000);
         Account a2 = new Account("Hannah", 7000);

        System.out.println("Before transfer John's bank account John has: "+ a1.getBalance()+ ", Hannah has: "+a2.getBalance());

        //transfer a1's acc to a2
        a1.transferAll(a2);
        System.out.println("After transferring John's money to Hannah: "+a1 + a2);

        //transfer a2's acc to a1
        a2.transferAll(a1);
        System.out.println("After transferring John's money to Hannah: "+a1 + a2);


        System.out.println("Does a1 has palindrome name: " + a1.isPalindrome());
        System.out.println("Does a2 has palindrome name: " + a2.isPalindrome());
    }
}
