package Bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new FileInputStream("words.txt"));
            String line;
            // count how many words in total in the txt
            int counterWhole = 0;
            // count how many words after remove the words in the txt
            int counterAfterRemove = 0;
            HashTable h = new HashTable();
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                counterWhole++;

                if (!(line.toLowerCase().contains("a")
                        || line.toLowerCase().contains("e")
                        || line.toLowerCase().contains("i")
                        || line.toLowerCase().contains("o")
                        || line.toLowerCase().contains("u"))) {
                    h.put(line);
                    counterAfterRemove++;
                }
            }

            System.out.println(counterWhole);
            System.out.println(counterAfterRemove);
            System.out.println("SQL in hash table? " + h.containsString("SQL"));
            System.out.println("RVSP in hash table? " + h.containsString("RVSP"));
            System.out.println("NYC in hash table? " + h.containsString("NYC"));
            System.out.println("java in hash table? " + h.containsString("java"));

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File can't be opened");
            System.exit(0);
        }


    }
}
