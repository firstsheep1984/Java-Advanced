package Bank;

import javax.swing.*;
import java.awt.*;

public class TextFieldDemo extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;
    public static final int NUMBER_OF_CHAR = 30;

    public static void main(String[] args) {
	// write your code here
    }

    public TextFieldDemo(){
        super("Text Field Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2,1));

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new BorderLayout());
        namePanel.setBackground(Color.white);

        JTextField name = new JTextField(NUMBER_OF_CHAR);


    }
}
