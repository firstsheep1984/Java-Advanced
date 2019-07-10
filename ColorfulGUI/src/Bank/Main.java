package Bank;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyPanel panel = new MyPanel();
        JFrame app = new JFrame();

        app.setTitle("Interesting");
        app.add(panel);
        app.setSize(400,400);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);

    }
}
