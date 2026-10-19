package test.java;

import java.util.Scanner;

public class homework4 {
	public static void main(String[] args)
	{
		String date;
		boolean isValid;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Input date in (yyyy-mm-dd) format: ");
			date = sc.nextLine();
			
			isValid = false;
			
			if (date.length() == 10 && date.charAt(4) == '-' && date.charAt(7) == '-') {
				try {
					int month = Integer.parseInt(date.substring(5, 7));
					int day = Integer.parseInt(date.substring(8, 10));
					
					if (month > 0 && month < 13 && day > 0 && day < 32) {
						isValid = true;
					}
				} 
				catch (NumberFormatException x) {
					isValid = false;
				}
			} 
			else {
				isValid = false;
			}
			
			if (isValid) {
				System.out.println("Valid date!");
				break;
			} else {
				System.out.println("Invalid date");
			}
		}
	}
}