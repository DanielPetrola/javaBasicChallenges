package javaChallenges;

import java.util.Scanner;

public class forLoopChallenge {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String user[] = {"Daniel", "Paulo", "Jessica"};
		String pass[] = {"ddd", "ppp", "jjj"};
		
		System.out.print("Enter your username and password.\nUsername: ");
		String userInput = s.nextLine();
		System.out.print("Password: ");
		String passInput = s.nextLine();
		
		for(int i = 0; i < user.length; i++) {
			if(!userInput.equalsIgnoreCase(user[i]) || !passInput.equals(pass[i])) {
				System.out.println("\nAccount not found");
				break;
			}
			else if(userInput.equalsIgnoreCase(user[i]) && passInput.equals(pass[i])){
				System.out.println("\nWelcome, " + user[i] + "."); 
				break;			
			}
		}
		
	}

}
