package Bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TwoTypePair<String, Integer> pair = new TwoTypePair<>("Yangyang", 99);
        System.out.println("The current score for " + pair.getFirst() + " is " + pair.getSecond());
        System.out.println("Please input the updated score: ");
        Scanner sc = new Scanner(System.in);
        int newScore = sc.nextInt();
        pair.setSecond(newScore);
        System.out.println("The new score for " + pair.getFirst() + " is " + pair.getSecond().toString());
    }
}
