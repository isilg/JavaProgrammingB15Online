package day52;
/**
* Create a class called Account
* it has 2 fields - name as String (protected) , balance as int (private)
*-- add constructor to set name and balance
*   -- add getters to the balance field
*   -- add deposit method that accept 1 int arugument
*   -- it will change the balance
*   -- add withdraw method that accept 1 int arugument
*   -- reduce the balance
*   -- add toString method for nice output
* Create an interface called Transferable
*   it has an abstract method- transferAll accept another Account object as parameter
*    - void transferAll(Account otherAccount)
*    Account implements Transferable interface
*    logic inside transferAll implementation
*          it should take all the balance from current account to other Account
* Create a class called   Account Action with main method
*    Test your code by creating few Account objects
*   Optionally :
* Add a method called isPalindrome and return true if account name is palindrome (case and space should not matter)
*/

public class Account implements Transferable{

    protected String name;
    private int balance;


    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }


    public int getBalance(){
        return balance;
    }

    //u deposit, u don't return anything this is why it is void
    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int with){
        balance -= with;
    }


    @Override
    public void transferAll(Account otherAccount) {
    //get the balance of current account, deposit it
    //to the other account, balance will be 0 here
    //set this balance to other account's balance
    //and then set this one to the 0
        otherAccount.balance += this.balance;
        this.balance = 0;

//    //II.Way-instead of this.balance u can use balance cause there is no confusion
//    //to other account do deposit how much I have here
//        otherAccount.deposit(this.balance);
//    //withdraw the balance that was sent to other account
//        this.withdraw(this.balance);

    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean isPalindrome(){
    //first store name in  temp then do all lowerCase and remove spaces
       String nameCopy = this.name.toLowerCase().replace(" ","");
    //reverse the value then check whether they r still same String or not
        String reverseName = "";
        for (int i = nameCopy.length()-1; i>=0; i--){
            reverseName += nameCopy.charAt(i);
        }
        return nameCopy.equals(reverseName);
    }


}
