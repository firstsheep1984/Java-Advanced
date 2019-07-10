package Bank;

import javax.swing.*;
import java.awt.*;

public class FirstWindow extends JFrame {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public FirstWindow() {
        super();
        setSize(WIDTH, HEIGHT);
        setTitle("First Window");

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton endButton = new JButton("CLICK TO END");
        EndingActionListener earListner = new EndingActionListener();
        endButton.addActionListener(earListner);
        add(endButton);
    }

}