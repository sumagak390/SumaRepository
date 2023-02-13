package my.dev.projectExamples.controlExamples;


	import java.util.Scanner;
	public class PrimeFactorExample {

	   public static void main(String args[]){
	      int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	      boolean isPrimeNumberOrNot = isPrime(number); // Calls the isPrime method
	      if(isPrimeNumberOrNot) {
	            System.out.println(number + " is prime number");
	        }
	        else{
	            System.out.println(number + " is a non-prime number");
	        }
	      
	}
	   private static  boolean isPrime(int num)
	    {
		   if(num == 1)
	            return  false;
	       for(int i=2;i<=num/2;i++)
	       {
	           if((num%i)==0)
	               return  false;
	       }
	       return true;
	    }
}
