package Bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = null;
        try {
             sc = new Scanner(new FileInputStream("read.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println("The file can't be opened");
            System.exit(0);
        }
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
       // sc.nextLine();
        String s = sc.nextLine();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(s);
        sc.close();
    }
}
