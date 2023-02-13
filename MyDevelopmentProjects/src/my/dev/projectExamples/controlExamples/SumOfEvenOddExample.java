package my.dev.projectExamples.controlExamples;

public class SumOfEvenOddExample {
	public static void main(String[] args) {
		//Scanner scn = new Scanner(System.in);
		//int a = scn.nextInt();
		int sumOfEvenNum = 0;
		int sumOfOddNum =0;
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("i is even ...."+ i);
				sumOfEvenNum =sumOfEvenNum+i;
				
			}
			else
			{
				sumOfOddNum = sumOfOddNum +i;
				System.out.println("i is odd ...."+i);
			}
		}
		System.out.println("sumOfEvenNum..."+sumOfEvenNum);
		System.out.println("sumOfOddNum..."+sumOfOddNum);
	}
}
