/**
 * Created by Иван on 08.07.2016.
 */
public class Test { // Тестовый модуль 17.082
    public static void main(String[] args) {

        Logic L = new Logic();

        Message msg = new Message("Бармен носит блестящий костюм, а сны делают из мертвых колдунов.");
        Key key = new Key("Ромашка");

        System.out.print("Исходное сообщение: ");
        System.out.println(msg.getmsg());

// Зашифровать сообщение
        msg = L.CoderDecoder(msg, key);
        System.out.print("Зашифрованное сообщение ");
        System.out.println(msg.getmsg());

// Дешифровать сообщение
        msg = L.CoderDecoder(msg, key);
        System.out.print("Расшифрованное сообщение: ");
        System.out.println(msg.getmsg());


    }
}
