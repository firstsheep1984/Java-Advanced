package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPanels extends JFrame implements ActionListener {

    public static void main(String[] args) {
	// write your code here
        ColorPanels gui = new ColorPanels();
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if(buttonString.equals("Red")){
            redPanel.setBackground(Color.red);
        }else if(buttonString.equals("White")){
            whitePanel.setBackground(Color.white);
        }else if(buttonString.equals("Blue")){
            bluePanel.setBackground(Color.blue);
        }else
            System.out.println("Unexpected error");

    }

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    public ColorPanels(){
        super("Panel Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1,3));

        redPanel = new JPanel();
        redPanel.setBackground(Color.gray);
        biggerPanel.add(redPanel);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.gray);
        biggerPanel.add(whitePanel);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.gray);
        biggerPanel.add(bluePanel);

        add(biggerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton buttonRed = new JButton("Red");
        buttonRed.setBackground(Color.red);
        buttonRed.addActionListener(this);
        buttonPanel.add(buttonRed);

        JButton buttonWhite = new JButton("White");
        buttonWhite.setBackground(Color.WHITE);
        buttonWhite.addActionListener(this);
        buttonPanel.add(buttonWhite);

        JButton buttonBlue = new JButton("Blue");
        buttonBlue.setBackground(Color.blue);
        buttonBlue.addActionListener(this);
        buttonPanel.add(buttonBlue);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
