package precourseConditional;

import java.util.Scanner;

public class lettergrade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your Grade: ");
		double num = in.nextDouble ();
		
		if (num < 65) {
		System.out.println("Your Letter Grade is F");
		}
		else if (num < 72) {
		System.out.println("Your Letter Grade is D");
		}
		else if (num < 80) {
		System.out.println("Your Letter Grade is C");
		}
		else if (num < 90) {
		System.out.println("Your Letter Grade is B");
		}
		else if (num <= 100) {
		System.out.println("Your Letter Grade is A");
		}
	}}
	
