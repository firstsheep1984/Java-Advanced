package Bank;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

       /* int w = getWidth();
        int h = getHeight();*/

        g.setColor(Color.yellow);
        g.fillRect(20,20,200,150);

        g.setColor(Color.red);
        g.drawRect(20,20,200,150);

        g.drawOval(20,20,100,150);

        g.setColor(Color.green);
        g.fillOval(50,200,150,150);

        g.setColor(Color.black);
        g.drawOval(50,200,150,150);

        g.drawString("welcome to java", 50, 50);
    }
}