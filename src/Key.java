/**
 * Created by Иван on 08.07.2016.
 */
public class Key {

    private String key;
    private int length;

    public Key(String key) {
        this.key = key;
        length = key.length();
    }
    public void setkey(String key) {
        this.key = key;
    }
    public String getkey() {
        return key;
    }
    public void setlength() {
        length = key.length();
    }
    public int getlength() {
        return length;
    }
}
