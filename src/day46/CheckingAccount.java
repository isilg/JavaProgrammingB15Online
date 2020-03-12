package day46;
public class CheckingAccount extends BankAccount {

    //Create constructor from Generate
    public CheckingAccount(String accountHolder, long accountNum, double balance) {
        super(accountHolder, accountNum, balance);
    }

    //Bank account will give you $200 if you deposit $3000
    @Override  //Generate -> Override Methods
    public void deposit(int amount) {
        if (amount >= 3000){
            super.deposit(amount+200);
        }else {
            super.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
