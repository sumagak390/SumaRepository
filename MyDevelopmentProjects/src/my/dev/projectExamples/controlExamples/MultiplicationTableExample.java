package my.dev.projectExamples.controlExamples;

import java.util.Scanner;

public class MultiplicationTableExample 
{
	
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Enter Multiplication table input..");
	int inputValue = scn.nextInt();
	for (int i=1;i<=10;i++)
	{
		int tableResult = inputValue * i;
		
		System.out.println(inputValue +"*" + i+ "="+tableResult );
	}
	//int tableResult1 = scn.nextInt();
		
		//System.out.println("Display result1 :"+ tableResult1);
		
		//int tableResult2= scn.nextInt();
		
		 //tableResult2 = num * i;
		
		//System.out.println("Display result2 :"+ tableResult2);
}
}

