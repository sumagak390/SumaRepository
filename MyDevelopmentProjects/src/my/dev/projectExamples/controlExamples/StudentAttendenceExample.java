package my.dev.projectExamples.controlExamples;

import java.util.Scanner;

public class StudentAttendenceExample {

	public static void main(String[] args) {

		Scanner scn =new Scanner(System.in);

		System.out.println("Enter total number of classes");

		int totalClasses = scn.nextInt();

		System.out.println("Enter attended number of classes");

		int attendedClasses =scn.nextInt();
		System.out.println("attendedClasses%totalClasses....."+attendedClasses%totalClasses+"%");

		if((attendedClasses%totalClasses)<75)

		{
			System.out.println("Student is not allowed to sit in exam");	
		}
		else
		{
			System.out.println("Student is  allowed to sit in exam");	

		}

	}
}
