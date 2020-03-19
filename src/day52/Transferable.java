package day52;

public interface Transferable {

    public abstract void transferAll(Account otherAccount);
    public default void transferSome(Account otherAccount, Account specificAmount){

    }
}
