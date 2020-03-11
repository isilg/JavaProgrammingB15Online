package day44.sub;

// Because SlackAdminUser and SlackUser from different package
// INTELLIJ import it
import day44.SlackUser;

public class SlackAdminUser extends SlackUser {
    //attribute
    int adminId;

    //Constructor
    // this.name deyince otomatikman name cikiyor benim
    // attribute lerim arasinda olmadigi halde. Ayni sekilde status.
    // cunku onlar otomatikman parent class indan gelen attribute ler
    public SlackAdminUser(String name, String status, int admin){
        this.name = name;
        this.status = status;
        this.adminId = admin;
    }

    public static void main(String[] args) {
        SlackAdminUser user1 = new SlackAdminUser("Akbar", "Release the horses", 101);
        System.out.println("user1 "+user1);
        // we are calling inherited methods
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        // we are calling our own methods
        user1.addChannel();
        user1.deleteMessage();
        user1.sendAtChannelMessage();

    }


    //behaviors:
    public void sendAtChannelMessage(){
        System.out.println(name+ " sending channel message");
    }

    public void deleteMessage(){
        System.out.println(name+ " deleting message");
    }

    public void addChannel(){
        System.out.println(name+" adding channel");
    }


    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
