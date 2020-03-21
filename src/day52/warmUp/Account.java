package day52.warmUp;

/**
* Create a class called Account
* it has 2 fields - name as String (protected) , balance as int (private)
*-- add constructor to set name and balance
*   -- add getters to the balance field
*   -- add deposit method that accept 1 int arg
*   -- it will change the balance
*   -- add withdraw method that accept 1 int arg
*   -- reduce the balance
*   -- add toString method for nice output
* Create an interface called Transferable
*   it has an abstract method- transferAll accept another Account object as parameter
*    - void transferAll(Account otherAccount)
*    Account implements Transferable interface
*    logic inside transferAll implementation
*          it should take all the balance from current account to other Account
* Create a class called Main with main method
*     Test your code by creating few Account objects
* Optionally :
*     let Account implements Comparable<Account>
*     Create List<Account> and sort them using Collections.sort(..)
*     Add a method called isPalindrome and return true if account name is palindrome (case and space should not matter)
*/

//%99.9 Comparable's type is same as Class name
public class Account implements Transferable, Comparable<Account>{

  //Variables(attributes),methods,and constructors, declared protected
  //in a superclass can be accessed only by in the same package or
  //from another packages by its subclasses.
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
    //II.Way-instead of this.balance u can use balance cause there is no confusion
    //to other account -> do deposit ->how much I have here
       //   otherAccount.deposit(this.balance);
    //withdraw the balance that was sent to other account
       //   this.withdraw(this.balance);
    }


    //Add extra part to question- transfer any amount to other account
    public void transferSome(Account otherAccount, int specificAmount){
        otherAccount.balance += specificAmount;
        balance -= specificAmount;
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


    //Add logic to compare by balance
    //it always return 1, -1, and 0. It is conventional
    @Override
    public int compareTo(Account otherAccount) {
        if (this.balance > otherAccount.balance){
            return 1;
        }else if (this.balance <otherAccount.balance){
            return  -1;
        }else
           return 0;
    }
}
