package Bank;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // first simple message
    //    JOptionPane.showMessageDialog(null,"Welcome to Java!", "My Application", JOptionPane.PLAIN_MESSAGE);
        // second input
        String name = JOptionPane.showInputDialog("What's your name?");
        String message = String.format("Hi %s!\n Welcome to Java Programming course.", name); // s% means String
        JOptionPane.showMessageDialog(null,message);
    }
}
