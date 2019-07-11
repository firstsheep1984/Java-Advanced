package Bank;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HappyFace extends JFrame implements ActionListener {
    public static final int WINDOW_WIDTH = 400;
    public static final int WINDOW_HEIGHT = 400;


    public static final int FACE_DIAMETER = 200;
    public static final int X_FACE = 100;
    public static final int Y_FACE = 100;


    public static final int EYE_WIDTH = 20;
    public static final int EYE_HEIGHT = 10;
    public static final int X_RIGHT_EYE = X_FACE + 55;
    public static final int Y_RIGHT_EYE = Y_FACE + 60;
    public static final int X_LEFT_EYE = X_FACE + 130;
    public static final int Y_LEFT_EYE = Y_FACE + 60;


    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 50;
    public static final int X_MOUTH = X_FACE + 50;
    public static final int Y_MOUTH = Y_FACE + 100;
    public static final int MOUTH_START_ANGLE = 180;
    public static final int MOUTH_ARC_SWEEP = 180;

    private boolean wink=false ;

    @Override
    public void actionPerformed(ActionEvent e) {
        wink = wink == true?false:true;
        repaint();
    }

    /*private class WinkAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            wink = wink == true?false:true;
            repaint();
        }
    }*/


    public static void main(String[] args)
    {
        HappyFace drawing = new HappyFace( );
        drawing.setVisible(true);
    }

    public HappyFace( )
    {
        super("Graphics Demonstration 2");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane( ).setBackground(Color.white);

       // JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Wink");
        jButton.addActionListener(this);
        //wink = false;
       // jPanel.add(jButton);
        add(jButton, BorderLayout.SOUTH);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        //Draw Eyes:
        g.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        if(wink)
            g.drawLine(X_LEFT_EYE, Y_LEFT_EYE,
                    X_LEFT_EYE + EYE_WIDTH, Y_LEFT_EYE);
        else
        g.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);

        //Draw Mouth:
        g.setColor(Color.red);
        g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT,
                MOUTH_START_ANGLE, MOUTH_ARC_SWEEP);
    }
}
