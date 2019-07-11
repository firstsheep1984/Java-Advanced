package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollBarsDemo extends JFrame implements ActionListener {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;
    public static final int LINES = 15;
    public static final int CHAR_PER_LINE = 30;

    private JTextArea message;
    private String memo1;
    private String memo2;

    public static void main(String[] args) {
        // write your code here
        ScrollBarsDemo gui = new ScrollBarsDemo();
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();


        if (actionCommand.equals("Save Memo 1"))
            memo1 = message.getText();
        else if (actionCommand.equals("Save Memo 2"))
            memo2 = message.getText();
        else if (actionCommand.equals("Clear"))
            message.setText("");
        else if (actionCommand.equals("Get Memo 1"))
            message.setText(memo1);
        else if (actionCommand.equals("Get Memo 2"))
            message.setText(memo2);
        else
            message.setText("Error in memo interface");
    }


    public ScrollBarsDemo() {
        super("Scroll Bars Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        message = new JTextArea(LINES, CHAR_PER_LINE);
        message.setBackground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(message);

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        textPanel.add(scrollPane);

        add(textPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());
        JButton memo1Button = new JButton("Save Memo 1");
        memo1Button.addActionListener(this);
        buttonPanel.add(memo1Button);

        JButton memo2Button = new JButton("Save Memo 2");
        memo2Button.addActionListener(this);
        buttonPanel.add(memo2Button);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        JButton get1Button = new JButton("Get Memo 1");
        get1Button.addActionListener(this);
        buttonPanel.add(get1Button);

        JButton get2Button = new JButton("Get Memo 2");
        get2Button.addActionListener(this);
        buttonPanel.add(get2Button);

        add(buttonPanel, BorderLayout.SOUTH);

    }
}
