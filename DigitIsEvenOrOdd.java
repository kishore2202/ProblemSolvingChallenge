package practice;

public class DigitIsEvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234567;
		while(n!=0)
		{
			int r=n%10;
			if(r%2==0)
			{
				System.out.println(r+" is even");
			}
			else
			{
				System.out.println(r+" is odd");
			}
			n/=10;
		}
	}
}
