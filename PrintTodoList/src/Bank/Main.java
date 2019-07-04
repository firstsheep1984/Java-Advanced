package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean done = false;
        ArrayList<String> todoArrayList = new ArrayList<>();
        while(!done){
            Scanner sc = new Scanner(System.in);
            System.out.println( "Please input your todo item");
            String line = sc.nextLine();
            todoArrayList.add(line);
            System.out.println( "Do you have more item?");
            String finishLine = sc.nextLine();
            if(!finishLine.equalsIgnoreCase("yes")){
                done = true;
            }
        }
        for(String item : todoArrayList){
            System.out.println(item);
        }

    }
}
