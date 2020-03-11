package day40;
import jdk.dynalink.NamedOperation;
public class BankAccount {

        String accountType;
        String accountHolder;
        long accountNumber;
        double balance;

        // setAllTheValue - Baslangicta account holder in adi, saving mi checking mi, hesapta nekadar var onlari yazmak icin set method kullaniyoruz
       // yukardaki degiskenleride kullanabiriz-accountType,accountHolder gibi ama for the simplicity boyle yazdik aynisi kullanmadik
       public void setAllTheValue( String newAccountType , String newAccountHolder, long newAccountNumber, double newBalance){
           accountType = newAccountType;    // accountType i newAccountType atiyoruz whatever user enter
           accountHolder = newAccountHolder;
           accountNumber = newAccountNumber;
           balance = newBalance ;
       }

        // showAccountBalance
      public void showAccountBalance(){
          System.out.println("balance= "+balance);
      }


        // ShowAccountHolderAccountType
      public void showAccountHolderAccountType(){
          System.out.println("Account holder is: "+accountHolder+" | "+"Account Type= "+accountType);
      }

        // getBalance return the balance
        // yukarda balance i double tanimladigimiz icin bu method da balance i dondurecegi icin double dondurmeli
       public double getBalance(){
           return balance;
       }

        // deposit (amount)
       public void deposit(double amount){
           balance += amount;
      }

        // withdraw (amount)
       public void withdraw(double amount){
           balance -= amount;
       }

        // withdraw100$Cash()
        // withdraw methodu vardi onu kullanarak sadece 100 liraya set et
       public void withdraw100$Cash(){
           withdraw(100);  // reusing the functionality we already have
       }

        // purchaseProduct(productPrice, count)
        // withdraw method uda kullanabilirsin kendinde yazabilirsin
       public void purchaseProduct(double productPrice, int count){
           double totalPrice = productPrice *count;
           balance -= totalPrice;
      }

        // toString()
        // Short version of creating toString = > right click IntelliJ


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

