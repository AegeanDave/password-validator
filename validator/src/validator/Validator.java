package validator;

import java.util.Scanner;

public class Validator {
	public static void main(String[] args){ 
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter your password:");
		String pw = kb.next();
		int count = 0;
		int result = CheckRules(pw, count);
		if(result == 2) {
			System.out.println("All rules passed, your password is strong enough.");
		}
		else {
			System.out.println(result+" rules passed, your password need to be stronger.");
		}		
	}
	public static int CheckRules(String pw, int count) {
		if(!pw.equals("password")) {
			count++;
		}
		if(pw.length()>=8) {
			count++;
		}
		return count;
	}
}
