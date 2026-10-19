package test.java;

import java.util.Scanner;

public class homework5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Input a number n: ");
		n = sc.nextInt();
		
		System.out.print("Prime numbers from 2 to " + n + ": ");
		
		for (int i = 2; i <= n; i++)
		{
			boolean isPrime = true;

			for (int j = 2; j <= Math.sqrt(i); j++)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
			}
		}
			if (isPrime) {
		System.out.print(i + " ");
		}
	}
	}
}