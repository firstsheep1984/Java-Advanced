package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyWindows extends JFrame implements ActionListener{

    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int NUMBER_OF_CHAR = 30;

    private JLabel numberLabel;
    private JTextField number;
    public static void main(String[] args) {

    }

    public MyWindows(){
        super("Display database series");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        JLabel nameLabel = new JLabel("Please enter how many fibonacci numbers:");
        add(nameLabel);

        number = new JTextField(NUMBER_OF_CHAR);
        add(number);

        numberLabel = new JLabel();
        add(numberLabel);

        JButton actionButton = new JButton("Generate");
        actionButton.addActionListener(this);
        add(actionButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        add(clearButton);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Generate")) {
            btn_insActionPerformed();
        } else if (actionCommand.equals("Clear")) {
            number.setText("");
            numberLabel.setText("");
        } else
            number.setText("Unexpected error.");

    }

    private void btn_insActionPerformed() {
        try {
            Class.forName("com.mysql.jc.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/javauser?user=root";

            Connection connect = DriverManager.getConnection(url);
            Statement state = connect.createStatement();
            String query = "insert into users(name,family,age) values('like','lee',15)";
            // query=String.format(query, txt_name_ins.getText(),txt_family_ins.getText(),txt_age_ins.getText());
            state.execute(query);
            state.close();
            connect.close();
        }catch (ClassNotFoundException | IllegalAccessException| InstantiationException| SQLException e){
            System.out.println("exception errors");
            e.printStackTrace();
        }
    }


    }