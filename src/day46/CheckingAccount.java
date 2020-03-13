package day46;
public class CheckingAccount extends BankAccount {

    //Create constructor from Generate
    public CheckingAccount(String accountHolder, long accountNum, double balance) {
        super(accountHolder, accountNum, balance); //using parent BankAccount method, the fields already set there, u will give the values in the main()
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

    @Override //@Override called annotation
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount("kate",124, 100);
        System.out.println(c1);
    }
}
