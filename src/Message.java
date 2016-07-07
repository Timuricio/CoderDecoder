/**
 * Created by Иван on 08.07.2016.
 */
public class Message {
    private String msg;
    private int length;

    public Message() {
        msg = "";
    }

    public Message(String msg) {
        this.msg = msg;
        length = msg.length();
    }

    public void setmsg(String msg) {
        this.msg = msg;
    }

    public String getmsg() {
        return msg;
    }

    public void setlength() {
        length = msg.length();
    }

    public int getlength() {
        return length;
    }

}
