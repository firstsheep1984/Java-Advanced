package Bank;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        g.setColor(Color.BLUE);
        g.drawLine(0,0, w, h);
    }
}