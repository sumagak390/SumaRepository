package my.dev.projectExamples.controlExamples;
import java.util.Scanner;
public class FactorialExample {
	public static void main(String[] args) {
		//int i,fact = 1;
		//int number =4;
		
		 
	//	for(i=1; i<=number ;i++)
	//	{
			//fact = fact*i;
		//	System.out.println("factorial"+ number+ "is"+ i);
			
	//	}
		
		/*
		 * scanner inputVal
		 * 
		 * int factVal = 1;
		 * 
		 *  for i=1 ; i<=inputVal;i++
		 * 		 1,2,3,4
		 * factVal = factVal*i;
		 * =factVal*1  = 1
		 * =1*2 =2
		 * 
		 * 
		 */
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Factorial Value....");
			int inputValue = scn.nextInt();
			if(inputValue==0) {
				System.out.println("Factorial of "+inputValue+" is 0");    

			}else {
				int factValue =1;
				int i;
				for( i =1;i<=inputValue;i++)
				{
				factValue =factValue*i;
				}		
				System.out.println("Factorial of "+inputValue+" is: "+factValue);   
			}
			 
	}
}
				
		
