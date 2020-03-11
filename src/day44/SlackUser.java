package day44;
/**
 *  Create a class called SlackUser
 *  attributes: name(protected), status(protected) as String
 *  behaviors: sendMessage, callSomeone, addEmoji
 *  Create 1 subclass called SlackAdminUser
 *  attribute: adminId as int
 *  behavior: sendAtChannelMessage, deleteMessage, addChannel, toString method
 *  Constructor: 3 argument constructor to set all fields value
 *
 */
public class SlackUser {
    // attributes
    protected String name;
    protected String status;

    //behaviors:
    public void sendMessage(){
        System.out.println("Slack user "+name+" typing");
    }

    public void callSomeone(){
        System.out.println("Slack user "+name+" calling");
    }

    public void addEmoji(){
        System.out.println("Slack user "+name+ " adding emoji:)");
    }

}
