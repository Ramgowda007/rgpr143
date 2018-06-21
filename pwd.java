public class CallingMethodsInSameClass

{

	public static void main(String[] args) 
	{

		printOne();

		printOne();

		printTwo();

	}



	public static void printOne() 
	{

		System.out.println("Hello git loves World");

	}



	public static void printTwo() {

		printOne();

		printOne();

	}

}
