package Bank;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame
        implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int NUMBER_OF_DIGITS = 30;

    private JTextField ioField1;
    private JTextField ioField2;
    private JTextField ioField3;
    private double result = 0.0;

    public static void main(String[] args)
    {
        Calculator aCalculator = new Calculator( );
        aCalculator.setVisible(true);
    }

    public Calculator( )
    {
        setTitle("Simplified Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLayout(new GridLayout(4,1));

        JPanel textPanel = new JPanel( );
        textPanel.setLayout(new FlowLayout( ));
        ioField1 =
                new JTextField(NUMBER_OF_DIGITS);
        ioField1.setText("Enter first number here.");
        ioField1.setBackground(Color.WHITE);
        textPanel.add(ioField1);
        add(textPanel);

        JPanel textPanel2 = new JPanel( );
        textPanel2.setLayout(new FlowLayout( ));
        ioField2 =
                new JTextField("Enter second number here.", NUMBER_OF_DIGITS);
        ioField2.setBackground(Color.WHITE);
        textPanel2.add(ioField2);
        add(textPanel2);

        JPanel textPanel3 = new JPanel( );
        textPanel3.setLayout(new FlowLayout( ));
        ioField3 =
                new JTextField("Result", NUMBER_OF_DIGITS);
        ioField3.setBackground(Color.WHITE);
        textPanel3.add(ioField3);
        add(textPanel3);
        textPanel3.setEnabled(false);
      //  textPanel3.setEditable(false);

        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.setLayout(new FlowLayout( ));

        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);
        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);
        JButton divideButton = new JButton("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);
        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);
        JButton squareRootButton = new JButton("√");
        squareRootButton.addActionListener(this);
        buttonPanel.add(squareRootButton);
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        add(buttonPanel);
    }


    public void actionPerformed(ActionEvent e)
    {
        try
        {
            assumingCorrectNumberFormats(e);
        }
        catch (NumberFormatException e2)
        {
            ioField1.setText("Error: Reenter Number.");
            ioField2.setText("Error: Reenter Number.");
        }
    }


    //Throws NumberFormatException.
    public void assumingCorrectNumberFormats(ActionEvent e)
    {
        String actionCommand = e.getActionCommand( );

        if (actionCommand.equals("+"))
        {
            result = stringToDouble(ioField1.getText( )) + stringToDouble(ioField2.getText( ));
            ioField3.setText(Double.toString(result));
        }
        else if (actionCommand.equals("-"))
        {
            result = stringToDouble(ioField1.getText( )) - stringToDouble(ioField2.getText( ));
            ioField3.setText(Double.toString(result));

        }
        else if (actionCommand.equals("/"))
        {
            double divider = stringToDouble(ioField2.getText( ));
            if(divider != 0) {
                result = stringToDouble(ioField1.getText()) / stringToDouble(ioField2.getText());
                ioField3.setText(Double.toString(result));
            }else{
                ioField2.setText("Divider shouldn't be 0");
                ioField3.setText("Error");
            }
        }
        else if (actionCommand.equals("*"))
        {
            result = stringToDouble(ioField1.getText( )) * stringToDouble(ioField2.getText( ));
            ioField3.setText(Double.toString(result));

        }
        else if (actionCommand.equals("√"))
        {
            result = Math.sqrt(stringToDouble(ioField1.getText( )));
            ioField2.setText("Please input numbers in the first text field");
            ioField3.setText(Double.toString(result));

        }
        else if (actionCommand.equals("Reset"))
        {
            result = 0.0;
            ioField1.setText("0.0");
            ioField2.setText("0.0");
            ioField3.setText("0.0");
        }
        else
            ioField1.setText("Unexpected error.");

    }


    //Throws NumberFormatException.
    private static double stringToDouble(String stringObject)
    {
        return Double.parseDouble(stringObject.trim( ));
    }

}
