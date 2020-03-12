package day46;

public class SavingAccount extends BankAccount{

    double interestRate;


    public SavingAccount(String accountHolder,long accountNum, double balance, double interestRate ){
        super(accountHolder, accountNum, balance);  //I can also type like  this.accountHolder= accountHolder; this.accountNum=accountNum because  we have these fields came from parent
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Kate", 12345,50000, 4.2);
        System.out.println(s1.toString());  //toString method olmadan hash code doner

        s1.withdraw(1000);
        System.out.println(s1);
    }

    //in our SavingAccount, if you withdraw money, you'll get $30 penalty
    //so we'll override the withdraw method to reflect this requirement
    @Override    //it is recommended typing this top of the inherited method
    public void withdraw(int amount){
        balance = balance - amount - 30;
    }


    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
