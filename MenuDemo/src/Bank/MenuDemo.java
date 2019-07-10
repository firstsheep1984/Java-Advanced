package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo extends JFrame implements ActionListener {

        public static void main(String[] args) {
        // write your code here
        MenuDemo gui = new MenuDemo();
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

    public MenuDemo(){
        super("Menu Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(1,3));

        JMenu colorMenu = new JMenu("Add Color");

        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(this);
        colorMenu.add(redChoice);

        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(this);
        colorMenu.add(whiteChoice);

        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(this);
        colorMenu.add(blueChoice);

        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        setJMenuBar(bar);

        redPanel = new JPanel();
        redPanel.setBackground(Color.gray);
        add(redPanel);

        whitePanel = new JPanel();
        whitePanel.setBackground(Color.gray);
        add(whitePanel);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.gray);
        add(bluePanel);

    }


}
