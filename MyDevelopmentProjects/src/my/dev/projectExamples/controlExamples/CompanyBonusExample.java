package my.dev.projectExamples.controlExamples;

import java.util.Scanner;

public class CompanyBonusExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter empolyee salary");
		
		int empolyeeSalary = scn.nextInt();
		 
		System.out.println("Enter year of service");
		
		int yearOfService = scn.nextInt();
		
		int bonusPercent = 5;
		
		if(yearOfService>5)
		{
			System.out.println("Yearly salary..."+ empolyeeSalary);
			
			int bonusAmount = (empolyeeSalary*bonusPercent)/100;
			 
			System.out.println("Bonus money..."+ bonusAmount);
			
			int totalSalary = empolyeeSalary + bonusAmount;
			
			System.out.println("Display Salary..." + totalSalary);
		}
		else 
			System.out.println("No bonus...");
		
		
	}

}
