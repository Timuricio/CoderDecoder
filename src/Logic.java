/**
 * Created by Иван on 08.07.2016.
 */
public class Logic {

    private int keyz; // переменная которая просто нужна


    public Message CoderDecoder(Message msg, Key key) { // Метод принимает сообщение и ключ с помощью которого вовращает уже зашифрованное сообщение

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
