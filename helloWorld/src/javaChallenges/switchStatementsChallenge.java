package javaChallenges;

import java.util.Scanner;

public class switchStatementsChallenge {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Please enter a month, day, and year in number format.\nMonth: ");
		int a = s.nextInt();
		System.out.print("Day: ");
		int b = s.nextInt();
		System.out.print("Year: ");
		int c = s.nextInt();
		
		if(b < 32 && b > 0) {
			
			switch(a) {
				case 1: System.out.print("January " + b + ", " + c);
				break;
				case 2: System.out.print("February " + b + ", " + c);
				break;
				case 3: System.out.print("March " + b + ", " + c);
				break;
				case 4: System.out.print("April " + b + ", " + c);
				break;
				case 5: System.out.print("May " + b + ", " + c);
				break;
				case 6: System.out.print("June " + b + ", " + c);
				break;
				case 7: System.out.print("July " + b + ", " + c);
				break;
				case 8: System.out.print("August " + b + ", " + c);
				break;
				case 9: System.out.print("September " + b + ", " + c);
				break;
				case 10: System.out.print("October " + b + ", " + c);
				break;
				case 11: System.out.print("November " + b + ", " + c);
				break;
				case 12: System.out.print("December " + b + ", " + c);
				break;
				default: System.out.println("\nInvalid month input");
			}
		}else {
			System.out.println("\nInvalid day input");
		}
	}

}
