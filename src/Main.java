import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Timur on 07.07.2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        CoderDecoderFrame frame = new CoderDecoderFrame();
        Logic logic = new Logic();

        frame.codeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Message text =  new Message(frame.inputText.getText());
                System.out.println(text.getmsg());
                Key key = new Key(frame.keyWord.getText());
                System.out.println(key.getkey());
                Message result = logic.CoderDecoder(text, key);
                System.out.println(result.getmsg());
                frame.outputText.setText(result.getmsg());
            }
        });

        frame.decodeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = frame.inputText.getText();
                String key = frame.keyWord.getText();
                String result = logic.CoderDecoder(new Message(text),new Key(key)).getmsg();
                frame.outputText.setText(result);
            }
        });
    }

}
