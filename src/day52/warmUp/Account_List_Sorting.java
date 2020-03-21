package day52.warmUp;
import day52.warmUp.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Account_List_Sorting {

    public static void main(String[] args) {

    //Create a list of Account. What does this list holds -> Account
        List<Account> accountList = new ArrayList<>();
        accountList.add( new Account("John Snow", 10000) );
        accountList.add( new Account("Vald", 11000) );
        accountList.add( new Account("Emme", 17000) );
        accountList.add( new Account("Ata" , 15000));

        System.out.println("accountlist before= \n"+ accountList);
        Collections.sort(accountList);
        System.out.println("accountlist after= \n"+ accountList);

   //Create another account with ur name and transfer everyone's money to ur account
        Account i1 = new Account("isil", 0);
        System.out.println("isil's account before transfer= "+i1);

       for (Account each: accountList){
           each.transferAll(i1);
       }System.out.println("isil's account after transfer= "+ i1);
        System.out.println(accountList);

        //II. WAY
//        for (int i=0; i<accountList.size(); i++){
//            accountList.get(i).transferAll(i1);
//        }System.out.println("isil's account after transfer= "+i1);
//        System.out.println(accountList);



         //a1 = new Account("Polymorphism", 1000);
    //What data types could be use in general not just for this example
    //Type could be it's own type like Account, super class or interface
    //that is implemented type, interface type that is implemented
    //Account a1; - Account object can be refer its own type
    //Comparable a1;  - type of a1 also can Comparable. It is not common
    //Transferable a1;
    //Object a1; - super type of ever class in Java
        //a1 holds object's address but t1 is much wider container
        //Account a1 = new Account("Polymorphism", 1000);
        //Transferable t1 = new Account("Polymorphism", 1000);
        //Object o1 = new Account("Polymorphism", 1000);


    }
}
