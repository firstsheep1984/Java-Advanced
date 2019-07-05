package Bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputStream = null;
        LinkedList1 linkedList1 = new LinkedList1();
        try {
            inputStream = new Scanner(new FileInputStream("read.txt"));
            String line;
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                String[] s = line.split("\\s+");
                for (int i = 0; i < s.length; i++) {
                    linkedList1.addToStart(s[i]);
                }
            }
            linkedList1.outputList();
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File can't be opened");
            System.exit(0);
        }
    }
}
