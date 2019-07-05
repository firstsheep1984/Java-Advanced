package Bank;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new Scanner(new FileInputStream("read.txt"));
            outputStream = new PrintWriter(new FileOutputStream("write.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File can't be opened");
            System.exit(0);
        }

        String s;
        int counter = 0;
        while (inputStream.hasNextLine()) {
            s = inputStream.nextLine();
            counter++;
            outputStream.println(counter + " " + s);
        }

        inputStream.close();
        outputStream.close();
    }
}
