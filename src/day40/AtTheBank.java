package day40;
public class AtTheBank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAllTheValue("Saving","Isil", 123456, 1000000);

        b1.showAccountBalance();

        b1.showAccountHolderAccountType();

        b1.deposit(3000);

        System.out.println("b1= "+b1);

        b1.withdraw100$Cash();
        System.out.println("b1= "+b1);

        b1.withdraw(1200);
        System.out.println("b1= "+b1);

        b1.purchaseProduct(120,3);
        System.out.println("b1= "+b1);


    }
}
