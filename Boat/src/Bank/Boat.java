package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.QuadCurve2D;

public class Boat extends JFrame implements ActionListener {
    public static final int WINDOW_WIDTH = 400;
    public static final int WINDOW_HEIGHT = 400;

    public static int X_BOAT = 100;
    public static final int Y_BOAT = 200;

    public static final int BOAT_WIDTH = 200;
    public static final int BOAT_HEIGHT = 50;

    private Color sailColor = Color.blue;
    private Color boatColor = Color.black;
    private float fAmount = (float) 1.0;

    public static void main(String[] args) {
        // write your code here
        Boat boat = new Boat();
        boat.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (X_BOAT < 400) {
            X_BOAT += 2;
        }
        if (fAmount <=1 && fAmount >0.05) {
            fAmount = (float) (fAmount - 0.05);
        }
        sailColor = Blend(Color.blue, Color.white, fAmount);
        boatColor = Blend(Color.black, Color.white, fAmount);
        repaint();
    }

    Color Blend(Color clOne, Color clTwo, double fAmount) {
        float fInverse = (float) (1.0 - fAmount);

        // I had to look up getting colour components in java.  Google is good :)
        float afOne[] = new float[3];
        clOne.getColorComponents(afOne);
        float afTwo[] = new float[3];
        clTwo.getColorComponents(afTwo);

        float afResult[] = new float[3];
        afResult[0] = (float) (afOne[0] * fAmount + afTwo[0] * fInverse);
        afResult[1] = (float) (afOne[1] * fAmount + afTwo[1] * fInverse);
        afResult[2] = (float) (afOne[2] * fAmount + afTwo[2] * fInverse);

        return new Color(afResult[0], afResult[1], afResult[2]);
    }

    public Boat() {
        super("My Boat");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);


        JButton jButton = new JButton("Move");
        jButton.addActionListener(this);
        add(jButton, BorderLayout.SOUTH);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // draw the body of the boat
        g.setColor(boatColor);
        g.drawArc(X_BOAT, Y_BOAT, BOAT_WIDTH, BOAT_HEIGHT, 180, 180);
        g.drawArc(X_BOAT, Y_BOAT, BOAT_WIDTH, BOAT_HEIGHT, 0, 180);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(boatColor);

        int[] x2 = {X_BOAT, X_BOAT + 30, X_BOAT + BOAT_WIDTH - 30, X_BOAT + BOAT_WIDTH};
        int[] y2 = {Y_BOAT + 25, Y_BOAT + 100, Y_BOAT + 100, Y_BOAT + 25};
        g2d.drawPolygon(x2, y2, 4);

        // draw the sail canvas
        g2d.setColor(sailColor);
        int[] x = {X_BOAT + 150, X_BOAT + 150, X_BOAT + 40};
        int[] y = {Y_BOAT - 150, Y_BOAT + 50, Y_BOAT + 50};
        g2d.drawPolygon(x, y, 3);
        g2d.fillPolygon(x, y, 3);

// draw String
        g.setFont(new Font("SansSerif", Font.PLAIN, 15));
        g.setColor(sailColor);
        g.drawString("Yangyang's Boat", X_BOAT + 30, Y_BOAT + 70);
    }
}
