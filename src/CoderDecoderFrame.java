import javax.swing.*;
import java.awt.*;

/**
 * Created by Timur on 07.07.2016.
 */
public class CoderDecoderFrame extends JFrame
{
    JTextField keyWord;
    JTextArea inputText;
    JTextArea outputText;
    JButton codeButton;
    JButton decodeButton;
    JButton copyButton;

    public CoderDecoderFrame() throws HeadlessException
    {
        super("Coder/Decoder");
        init();
    }

    private void init()
    {
        setPreferredSize(new Dimension(500,500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setDefaultLookAndFeelDecorated(false);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.insets = new Insets(5,5,5,5);

        keyWord = new JTextField("Enter the KeyWord");
        keyWord.setEditable(true);
        c.ipady = 10;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth  = 6;

        getContentPane().add(keyWord,c);

        c.weighty = 1;
        inputText = new JTextArea("Enter the mesage");
        inputText.setEditable(true);
        inputText.setLineWrap(true);
        inputText.setWrapStyleWord(true);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;

        getContentPane().add(inputText,c);

        outputText = new JTextArea("Result");
        outputText.setEditable(false);
        outputText.setLineWrap(true);
        outputText.setWrapStyleWord(true);
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 3;

        getContentPane().add(outputText,c);

        c.weighty = 0;
        codeButton = new JButton("Coder");
        c.ipady = 10;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        getContentPane().add(codeButton,c);

        decodeButton = new JButton("Decoder");
        c.gridx = 2;
        c.gridy = 2;
        c.gridwidth = 2;
        getContentPane().add(decodeButton,c);

        copyButton = new JButton("Copy");
        c.gridx = 4;
        c.gridy = 2;
        c.gridwidth = 2;
        getContentPane().add(copyButton,c);




        pack();
        setVisible(true);
    }
}
