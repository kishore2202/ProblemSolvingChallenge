package practice;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("Outer try block");
			//System.out.println(10/0);
			try {
				System.out.println("Inner try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception raised");
			}
			System.out.println("hi");
		}
		catch(Exception e)
		{
			System.out.println("Outer catch block");
		}
		finally {
			System.out.println("finally block");
		}
	}

}
