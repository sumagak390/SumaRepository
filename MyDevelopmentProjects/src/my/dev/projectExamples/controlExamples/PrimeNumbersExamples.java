package my.dev.projectExamples.controlExamples;

public class PrimeNumbersExamples {
	public static void main (String[] args)
	{
		String primeNumbers = "";
		for (int number = 1; number <= 100; number++)
		{
			if(isPrime(number)) {
				primeNumbers = primeNumbers + number + " ";
			}
		}
		System.out.println("Prime numbers between 1 and 100 are :");
		System.out.println(primeNumbers);
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
