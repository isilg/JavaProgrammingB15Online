package day52.warmUp;

import day52.warmUp.Account;

public interface Transferable {

    public abstract void transferAll(Account otherAccount);
    public default void transferSome(Account otherAccount, Account specificAmount){

    }
}
