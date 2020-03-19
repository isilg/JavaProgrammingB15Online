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
*   Optionally : let Account implements Comparable<Account>
*   Create List<Account> and sort them using Collecions.sort(..)
*   add a method inside Account class called
*   isPalindrome return true if account name is palidrome (case and space should not matter)
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
    public void setDeposit(int amount){
        balance += amount;
    }

    public void withdraw(int with){
        balance -= with;
    }


    @Override
    public void transferAll(Account otherAccount) {

    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }


}
