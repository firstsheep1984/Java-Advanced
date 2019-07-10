package Bank;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String ans = JOptionPane.showInputDialog("Please enter an integer");
        int n = Integer.parseInt(ans);

        String message;
        if(n%2==0){
            message = "This is an even number";
        }else{
            message = "This is an odd number";
        }
        JOptionPane.showMessageDialog(null,message);
    }
}
