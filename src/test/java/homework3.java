package test.java;

import java.util.Scanner;

public class homework3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.print("Input 5 numbers: ");
		
		for (int i = 0; i < 5; i++)
		{
			nums[i] = sc.nextInt();
		}
		int min = nums[0];
		int max = nums[0];
		
		for (int i = 1; i <5; i++)
		{
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
		}
		System.out.println("Among all the five input numbers (" + nums[0] + ", " + nums[1] + ", " + nums[2] + ", " + nums[3] + ", and " + nums[4] + ") ");
		System.out.print("min is " + min + " max is " + max);
	}
}