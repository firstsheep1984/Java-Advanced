package Bank;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrame extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public BorderLayoutFrame(){
        super("BorderLayout Demonstration");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel label1 = new JLabel("First Label");
        add(label1,BorderLayout.NORTH);

        JLabel label2 = new JLabel("Second Label");
        add(label2,BorderLayout.SOUTH);

        JLabel label3 = new JLabel("Third Label");
        add(label3,BorderLayout.CENTER);
    }
}
