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

        frame.codeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = frame.inputText.getText();
                String key = frame.keyWord.getText();
                String result = CoderDecoder.code(text,key);
                frame.outputText.setText(result);
            }
        });

        frame.decodeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = frame.inputText.getText();
                String key = frame.keyWord.getText();
                String result = CoderDecoder.decode(text,key);
                frame.outputText.setText(result);
            }
        });
    }

}
