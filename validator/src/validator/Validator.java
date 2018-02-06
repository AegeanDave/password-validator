package validator;

import java.util.Scanner;

public class Validator {
	public static void main(String[] args){ 
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter your password:");
		String pw = kb.next();
		CheckRules(pw);
	}
	public static void CheckRules(String pw) {
		if(pw.length() < 8) {
			System.out.println("Your password only passed one rule which is not allowed");
		}
		else {
			if(!pw.equals("password")) {
				System.out.println("Your password passed all rules");
			}
			else {
				System.out.println("Your password only passed one rule which is not allowed");
			}
		}
	}
}
