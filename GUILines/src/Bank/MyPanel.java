package Bank;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int n = 20;
        int w = getWidth();
        int h = getHeight();


        for (int i = 0; i < n; i++) {
            int j = n-i;
            g.setColor(Color.RED);
            g.drawLine(i*w/n,0, 0, j*h/n);

            g.setColor(Color.BLUE);
            g.drawLine(i*w/n,h, w, j*h/n);
        }

    }
}