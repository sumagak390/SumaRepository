package my.dev.projectExamples;

import java.util.Scanner;

public class RectangleSquareExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of Length");
		int length = scn.nextInt();
		System.out.println("Enter the value of Breadth");
		int breadth = scn.nextInt();


		if(length == breadth)
		{
			System.out.println("It is square");
		}
		else 
		{
			System.out.println("It is rectangle");
		}
	}
}