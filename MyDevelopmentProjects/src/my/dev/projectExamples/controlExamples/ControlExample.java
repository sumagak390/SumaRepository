package my.dev.projectExamples.controlExamples;

import java.util.Scanner;

public class ControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn =new Scanner(System.in);
    System.out.println("Enter a number");
    int i = scn.nextInt();
    if (i%2 ==0)
    {
    	System.out.println(i+"");
    }
	}

}
