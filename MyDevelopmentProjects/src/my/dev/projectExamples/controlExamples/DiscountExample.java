package my.dev.projectExamples.controlExamples;

import java.util.Scanner;

public class DiscountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Total cost of the purchased quantity");

		int totalCost = scn.nextInt();

		int discountPercent = 10;// discount 10%

		if(totalCost>1000) //Here total purchase cost should be greater then 1000
		{
			System.out.println("Total cost of money...." + totalCost);

			int discountAmount=(totalCost*discountPercent)/100;

			System.out.println("Discount money...." + discountAmount);

			int totalBill = totalCost - discountAmount;

			System.out.println("Total bill after discount...." + totalBill);

		}
		else 

			System.out.println("No discount appiled ,your total bill is..."+ totalCost);
	}

}
