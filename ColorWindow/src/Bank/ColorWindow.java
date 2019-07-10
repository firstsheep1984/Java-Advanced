package Bank;

import javax.swing.*;
import java.awt.*;

public class ColorWindow extends JFrame {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public ColorWindow(Color theColor){
        super("No charge for color");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(theColor);

        JLabel aLabel = new JLabel("I am a label");
        add(aLabel);
    }

    public ColorWindow(){
        this(Color.PINK);
    }
}
