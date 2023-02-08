package my.dev.projectExamples.controlExamples;

import java.util.Scanner;

public class AgeExample {
	public static void main(String[] args) {

		System.out.println("Enter age of person a:");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.println("Enter age of person b:");
		int b = scn.nextInt();
		System.out.println("Enter age of person c:");
		int c = scn.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println(" Person a is older");
		}
		
		else if((b>a)&&(b>c))
		{
			System.out.println("Person b is older");
		}
		
		else if((c>a)&&(c>b))
		{
			System.out.println("Person c is older");
		}
	    if((a<b)&& (a<c))
		{
			System.out.println("Person a is younger");
		}
		
		else if((b<a)&& (b<c))
		{
			System.out.println("Person b is younger");
		}
		else if((c<a)&& (c<b))
		{
			System.out.println("Person c is younger");
		}
	}

}
