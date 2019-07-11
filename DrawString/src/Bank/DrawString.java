package Bank;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DrawString extends JFrame implements ActionListener {
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

    public static final int POINT_SIZE = 24;

    private boolean wink=false ;
    private Font font= new Font("SansSerif", Font.PLAIN, POINT_SIZE);
    private Color penColor= Color.black;
    String theText= "Push the button.";

    @Override
    public void actionPerformed(ActionEvent e) {
        penColor = Color.RED;
        font =
                new Font("Serif", Font.BOLD|Font.ITALIC, POINT_SIZE);
        theText = "Thank you. I needed that.";
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
        Bank.DrawString drawing = new Bank.DrawString( );
        drawing.setVisible(true);
    }

    public DrawString( )
    {
        super("Draw String Demonstration");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane( ).setBackground(Color.white);

       // JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Color String");
        jButton.addActionListener(this);
        //wink = false;
       // jPanel.add(jButton);
        add(jButton, BorderLayout.SOUTH);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setFont(font);
        g.setColor(penColor);
        g.drawString(theText,X_FACE,Y_FACE);
    }
}
