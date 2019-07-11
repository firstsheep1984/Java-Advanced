package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerDemo extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;
    public static final int SMALL_WIDTH = 200;
    public static final int SMALL_HEIGHT = 200;

    private class CheckOnExit implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            ConfirmedWindow checkers = new ConfirmedWindow();
            checkers.setVisible(true);
        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }

    public static void main(String[] args) {
        // write your code here
        WindowListenerDemo gui = new WindowListenerDemo();
        gui.setVisible(true);
    }


    public WindowListenerDemo() {
        super("Windows Listener Demo");
        setSize(WIDTH, HEIGHT);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // here we add windows listener
        addWindowListener(new CheckOnExit( ));

        setLayout(new BorderLayout());

        JLabel aLable = new JLabel("A demo");
        add(aLable, BorderLayout.CENTER);
    }

    private class ConfirmedWindow extends JFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonString = e.getActionCommand();

            if (buttonString.equals("Yes")) {
                System.exit(0);
            } else if (buttonString.equals("No")) {
                dispose();
            } else
                System.out.println("Unexpected error");
        }

        public ConfirmedWindow() {
            super("Confirm Window");
            setSize(SMALL_WIDTH, SMALL_HEIGHT);
            getContentPane().setBackground(Color.YELLOW);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            setLayout(new BorderLayout());

            JLabel confirmLabel = new JLabel(
                    "Are you sure you want to exit?");
            add(confirmLabel, BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setBackground(Color.ORANGE);
            buttonPanel.setLayout(new FlowLayout());

            JButton exitButton = new JButton("Yes");
            exitButton.addActionListener(this);
            buttonPanel.add(exitButton);

            JButton cancelButton = new JButton("No");
            cancelButton.addActionListener(this);
            buttonPanel.add(cancelButton);

            add(buttonPanel, BorderLayout.SOUTH);
        }
    }
}
