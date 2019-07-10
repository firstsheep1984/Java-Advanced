package Bank;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ColorWindow w1 = new ColorWindow();
        w1.setVisible(true);

        ColorWindow w2 = new ColorWindow(Color.BLUE);
        w2.setVisible(true);
    }
}
