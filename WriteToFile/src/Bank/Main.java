package Bank;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PrintWriter printWriter = null;
        try{
            printWriter = new PrintWriter(new FileOutputStream("Text.txt"));

        }catch(FileNotFoundException e){
            System.out.println("Error opening the file");
            System.exit(0);
        }
        System.out.println("Writing to file");

        printWriter.println("The quick brown fox");
        printWriter.println("jumped over the lazy dog");

        printWriter.close();

        System.out.println("End of the program");
    }
}
