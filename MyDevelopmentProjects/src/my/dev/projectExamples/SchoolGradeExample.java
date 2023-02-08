package my.dev.projectExamples;

import java.util.Scanner;

public class SchoolGradeExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Student Marks");
		int marks =scn.nextInt();
		if(marks<25)
		{
			System.out.println("Student Grade F");
	}
		else if(marks>25 && marks<45)
		{
			System.out.println("Student Grade E");
			
		}
		else if(marks>45 && marks<50)
		{
			System.out.println("Student Grade D");
		}
		else if(marks>50 && marks<60)
		{
			System.out.println("Student Grade C");
		}
		else if(marks>60 &&marks<80)
		{
			System.out.println("Student Grade B");
			
		}
		else if(marks >80)
		{
			System.out.println("Student Grade A");
		}
		
		
	}

}
