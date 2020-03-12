package day46;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;

    //always add no arg constructor in super class to
    //avoid error in sub class because of super() call
    public BankAccount(){
    }

   //Creating constructor :  Generate - >Constructor
    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super()  even we don't see super() is the first constructor we get no matter what
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit(int amount){  //it could be double but for the simplicity we chose it as int
        balance += amount;      //balance = this.balance+  amount
    }

    public void withdraw(int amount){
        balance -= amount;
    }


}
