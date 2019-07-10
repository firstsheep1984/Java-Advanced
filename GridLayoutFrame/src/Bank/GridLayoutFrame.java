package Bank;

import javax.swing.*;
import java.awt.*;

public class GridLayoutFrame extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public static void main(String[] args) {
	// write your code here
        GridLayoutFrame gui = new GridLayoutFrame(2,3);
        gui.setVisible(true);
    }

    public GridLayoutFrame(int rows, int columns){
        super();
        setSize(WIDTH, HEIGHT);
        setTitle("GridLayout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(rows, columns));

        JLabel label1 = new JLabel("First Lable");
        add(label1);

        JLabel label2 = new JLabel("Second Lable");
        add(label2);

        JLabel label3 = new JLabel("Third Lable");
        add(label3);

        JLabel label4 = new JLabel("Fourth Lable");
        add(label4);

        JLabel label5 = new JLabel("Fifth Lable");
        add(label5);
    }
}
