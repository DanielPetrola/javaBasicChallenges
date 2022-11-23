package javaChallenges;

import java.util.Scanner;

public class inputAndArithmeticOperatorsChallenge {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x, y, sum;
		System.out.print("Num1: ");
		x = s.nextInt();
		System.out.print("Num2: ");
		y = s.nextInt();
		
		sum = x + y;
		System.out.println("The sum is " + sum);
	}

}
