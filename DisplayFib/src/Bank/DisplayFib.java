package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayFib extends JFrame
        implements ActionListener {


    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int NUMBER_OF_CHAR = 30;

    private JLabel numberLabel;
    private JTextField number;

    public static void main(String[] args) {
        DisplayFib gui = new DisplayFib();
        gui.setVisible(true);
    }


    public DisplayFib() {
        super("Display Fibnacci series");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        JLabel nameLabel = new JLabel("Please enter how many fibonacci numbers:");
        add(nameLabel);

        number = new JTextField(NUMBER_OF_CHAR);
        add(number);

        numberLabel = new JLabel();
        add(numberLabel);

        JButton actionButton = new JButton("Generate");
        actionButton.addActionListener(this);
        add(actionButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        add(clearButton);


    }


    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Generate")) {
            int n = Integer.parseInt(number.getText());

            numberLabel.setText( getFib(n));
        } else if (actionCommand.equals("Clear")) {
            number.setText("");
            numberLabel.setText("");
        } else
            number.setText("Unexpected error.");
    }

    private String getFib(int n) {
        String s = null;
        if (n == 1) {
            s = "0";
        } else if (n == 2) {
            s = "0, 1";
        } else if (n >= 3) {
            int t1 = 0, t2 = 1;
            s = "0,1,";
            for (int i = 1; i <= n - 2; ++i) {
                int sum = t1 + t2;

                s = s.concat(String.valueOf(sum) + ",");
                t1 = t2;
                t2 = sum;
            }
        }

        return s;
    }

}

   
