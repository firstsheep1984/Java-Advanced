package Bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pair<String> wordPair = new Pair<String>("Happy", "Day");
        System.out.println("input two words: ");
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();
        Pair<String> inputPair = new Pair<String>(firstWord, secondWord);
        if(wordPair.equals(inputPair)){
            System.out.println("You guess the right words and order!");
        }else{
            System.out.println("You guess wrong.\n" +
                    "You guessed " + inputPair.toString() +".\n" +
                    "the right words are " + wordPair.toString() +".");
        }
    }
}
