package test.java;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		int a, b, c;
		double delta, x1, x2;
		
		System.out.println("Welcome to our program ");
		System.out.println("Quadratic Equation Solve ax^2 + bx + c = 0 ");
		System.out.print("Input a: " );
		a = sc.nextInt();
		System.out.print("Input b: " );
		b = sc.nextInt();
		System.out.print("Input c: " );
		c = sc.nextInt();
		
		delta = (b * b) - (4 * a * c);

		
		if (delta > 0 )
		{
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("The roots of this equation: " + a + "x^2 " + b + "x" + " + " + c + " are: x1 = " + x1 + "\n" + "x2 = " + x2);
		}
		else
		{
			System.out.println("This equation does not have roots.");
		}
	}
}