package day52;
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

    }
}
