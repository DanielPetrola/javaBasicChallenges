package javaChallenges;

import java.util.Scanner;

public class whileLoopChallenge {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Guess the magic number between 0 and 10. You have 3 guesses.");
		
		int a, i = 0;
		while(i < 3) {
			a = s.nextInt();
			
			if(i == 2) {
				System.out.println("You lose");
				break;
			}
				if(a < 0 || a > 10) {
					System.out.println("Your input is invalid.");
					break;
				}else if(a == 8) {
					System.out.println("You guessed it right!");
					break;
				}else {
					System.out.println("Guess again. You have " + (2-i) + " guess(es) left.");
				}
			i++;
		}
	}

}
