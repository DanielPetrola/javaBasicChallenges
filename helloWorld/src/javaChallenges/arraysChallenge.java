package javaChallenges;

import java.util.Scanner;

public class arraysChallenge {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String names[] = {"Daniel", "Paulo", "Jessica", "Ruth"};
		String email[] = {"d@email.com", "p@email.com", "j@email.com", "r@email.com"};
		String password[] = {"ddd", "ppp", "jjj", "rrr"};
		
		System.out.print("Enter an index: ");
		int x = s.nextInt();
		
		System.out.println("Index: " + x);
		System.out.println("Name: " + names[x]);
		System.out.println("Email: " + email[x]);
		System.out.println("Password: " + password[x]);
	}

}
