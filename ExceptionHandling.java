package practice;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println("Inner try");
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Raised");
		}
		finally {
			System.out.println("Execution done!");
		}
	}

}
