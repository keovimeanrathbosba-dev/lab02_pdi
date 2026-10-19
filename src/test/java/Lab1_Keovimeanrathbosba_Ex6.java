package test.java;

import java.util.Scanner;

public class homework6 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double[] scores = new double[4];
		String[] subjects = {"Math", "English", "Physics", "Programming"};
		double sum = 0;
		
		System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");

		for (int i = 0; i < 4; i++)
		{
			scores[i] = sc.nextDouble();
			sum += scores[i];
		}		
		double min = scores[0];
		double max = scores[0];
		int minIndex = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < 4; i++)
		{
			if (min > scores[i])
				{
				min = scores[i];
				minIndex = i;
				}
			if (max < scores[i])
			{
				max = scores[i];
				maxIndex = i;
			}
		}
		double avg = sum/4;
	System.out.println("Max score is: " + max + " (" + subjects[maxIndex] + ")");
	System.out.println("Min score is: " + min + " (" + subjects[minIndex] + ")");
	System.out.println("Average score of this student is: " + avg);
	}
}