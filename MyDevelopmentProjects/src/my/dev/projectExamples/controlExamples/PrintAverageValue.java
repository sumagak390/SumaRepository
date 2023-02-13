package my.dev.projectExamples.controlExamples;

import java.util.Scanner;

public class PrintAverageValue {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter values to averege those values , Enter q to quite program..");
		//Take integer inputs till the user enters 0 and print the average of all numbers

		int input =1;
		int sum = 0;
		int count = 0;
		while (input !=0){
			input= scn.nextInt();
			count = count+1;
			sum = sum+input;
		}
		System.out.println("sum of the numbers.."+sum);
		System.out.println("count of numbers.."+count);

		System.out.println("Average of the numbers.."+(sum/count));
	}
}
