/**
 * Created by Иван on 08.07.2016.
 */
public class Logic {
    //private String msg;
    //private String key;
    private int keyz;



    public Message CoderDecoder(Message msg, Key key) {

        Message remsg = new Message();

        for (int i = 0, y = 0; i < msg.getlength(); i++, y++) {
            if (y == key.getlength()) y = 0;
            keyz = (int) key.getkey().charAt(y);
            remsg.setmsg((remsg.getmsg() + (char) (msg.getmsg().charAt(i) ^ keyz)));
        }

        remsg.setlength();
        return remsg;


    }


}
