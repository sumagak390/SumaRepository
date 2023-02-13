package my.dev.staticAndNonStaticExample;

public class StaticNonStatic {
	//Static Variable declaration
	static int val = 6;
	int a = 10;//Non static variable declaration and 10 value assignment

	//Static Block - Executes or loads first by JVM before main method
	static {
		System.out.println("Static Block.....");
	}


	// Static Method (void - NO return )
	private static int staticMethod(int a, int b) {
		return a+b;
	}



	public static void main(String[] args) {
		System.out.println("main method....");
		val = 10;//Changing static variable from 6 to 10

		//Static method calling - Start - 3 ways

		staticMethod(10, 20); //1. Call the method directly OR
		//2. Class name.static method name
		StaticNonStatic.staticMethod(10, 20);

		//3.Create class object and call the static method
		StaticNonStatic sn = new StaticNonStatic();//Class object creation
		sn.staticMethod(10, 20); // Not necessary to call this method like this , use above any of the 2 methods if needed

		//Static method calling - End






	}


	// NOn Static Method (void - NO return )
	private int nonStaticMethod(int a, int b,int c) {
		return a+b;
	}
}
