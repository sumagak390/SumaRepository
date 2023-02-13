package my.dev.projectExamples.controlExamples;

import java.util.Scanner;

public class AverageValueExample {
	

	public static void main(String[] args) {
		
	
		Scanner scn = new Scanner(System.in);
	    
//		System.out.println("Take first number from keyboard:");
//		 int firstVal = scn.nextInt();
//		 System.out.println("Take second number from keyboard:");
//		 int secondVal = scn.nextInt();
//		 System.out.println("Take third number from keyboard:");
//		 int thirdVal = scn.nextInt();
//		 System.out.println("Take fourth number from keyboard:");
//		 int fourthVal = scn.nextInt();
//		 System.out.println("Take fifth number from keyboard:");
//		 int fifthVal = scn.nextInt();
//		 System.out.println("Take sixth number from keyboard:");
//		 int sixthVal = scn.nextInt();
//		 System.out.println("Take seventh number from keyboard:");
//		 int seventhVal = scn.nextInt();
//		 System.out.println("Take eightth number from keyboard:");
//		 int eightthVal = scn.nextInt();
//		 System.out.println("Take nineth number from keyboard:");
//		 int ninethVal = scn.nextInt();
//		 System.out.println("Take tenth number from keyboard:");
//		 int tenthVal = scn.nextInt();
		 
		 int totalCount = 10;
		 int sum = 0;
		 for(int i=1;i<=10;i++) {
			 sum =  sum+i;
		 }
		 System.out.println("sum:"+sum);
		float avgVal = sum/totalCount;
		 System.out.println("avgVal:"+avgVal);

	}
}
