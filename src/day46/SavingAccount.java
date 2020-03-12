package day46;
public class SavingAccount extends BankAccount{

    double interestRate;

    public SavingAccount(String accountHolder,long accountNum, double balance, double interestRate ){
        super(accountHolder, accountNum, balance);  //I can also type like  this.accountHolder= accountHolder; this.accountNum=accountNum because  we have these fields came from parent
        this.interestRate = interestRate;
    }
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Kate", 12345,500, 0.042);
        System.out.println(s1.toString());  //toString method olmadan hash code doner

        s1.withdraw(100);
        System.out.println("s1= " + s1);

        s1.deposit(1000);
        System.out.println("s1= "+s1);
    }

    //in SavingAccount, if you withdraw money, you'll get $30 penalty
    //so we'll override the withdraw method to reflect this requirement
    @Override    //it is recommended typing this top of the inherited method
    public void withdraw(int amount){
       // balance = balance - amount - 30;
        super.withdraw(amount);  //calling parent's withdraw()method-> balance-=100
                                //amount is my arg and it is set to 100 in the main
                                //It doesn't print anything in the parent, it just set the balance
        super.withdraw(30);  //now balance is 400. Again it is calling parent's
                                     //withdraw() method. amount is $30 -> balance -= amount
                                     //400-=30. Now method is done we can go back to the main.
                                    //IT IS NOT returning super.withdraw(amount); on the screen,
                                    // we are not done with the method. After finishing inside
                                    //the method then go back to the main and print!!
    }

    @Override   //@Override called annotation
    public void deposit(int amount){

        //balance += amount + amount*interestRate;
        int actualAmount = (int)(amount + amount*interestRate);  //calculating the interest rate
                                                                //and casting to int variable because
                                                                //deposit method accept int not double
        super.deposit(actualAmount);
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
