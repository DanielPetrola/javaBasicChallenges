package javaChallenges;

import java.util.Scanner;

public class ConditionalStatementsChallenge {

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			float a, b, c, d, average;
			String result[] = {"Error", "With Highest Honors", "With High Honors", "With Honors", "Passed", "Failed"};
			
			System.out.print("Enter your grade in \nEnglish: ");
			a = s.nextFloat();
			System.out.print("Math: ");
			b = s.nextFloat();
			System.out.print("Science: ");
			c = s.nextFloat();
			System.out.print("History: ");
			d = s.nextFloat();
			
			average = (a + b + c + d)/4;
			System.out.println("\nAverage: " + average);
			
			if(average > 100) {
				System.out.println(result[0]);
			}else if(average <= 100 && average >= 98) {
				System.out.println(result[1]);
			}else if(average <= 97.99 && average >= 95) {
				System.out.println(result[2]);
			}else if(average <= 94.99 && average >= 90) {
				System.out.println(result[3]);
			}else if(average <= 89.99 && average >= 75) {
				System.out.println(result[4]);
			}else if(average < 75) {
				System.out.println(result[5]);
			}
}
}