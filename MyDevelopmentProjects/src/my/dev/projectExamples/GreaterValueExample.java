package my.dev.projectExamples;

import java.util.Scanner;

public class GreaterValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter first value");
		int FirstValue = scn.nextInt();
		System.out.println("Enter second value");
		int SecondValue = scn.nextInt();
		if(FirstValue > SecondValue)
		{
		System.out.println("First value is Greater ");
		}
		else
		{
	    System.out.println("Second value is Greater");	
		}
				

	}

}
