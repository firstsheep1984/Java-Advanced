package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Double> score = new ArrayList<>();

        System.out.println("enter golf scores:");
        fillArrayList(score);
        showDifference(score);
    }

    private static void showDifference(ArrayList<Double> score) {
        double average = computeAverage(score);
        System.out.println("The average is " + average);
        for(double d :score){
            System.out.println("The score is " + d + ", the difference from the average is " + (d - average));
        }
    }

    private static Double computeAverage(ArrayList<Double> score) {
        double total = 0;
        for(Double s : score){
            total = total + s;
        }
        int num = score.size();
        double average = total / num;
        return average;
    }

    private static void fillArrayList(ArrayList<Double> score) {
        boolean fill = true;
        System.out.println("enter non-negative numbers for the score, and a negative number to end:");
        while(fill){

            Scanner sc = new Scanner(System.in);
            double oneScore = sc.nextDouble();
            if(oneScore>= 0){
                score.add(oneScore);
            }else{
                fill = false;
            }

        }


    }
}
