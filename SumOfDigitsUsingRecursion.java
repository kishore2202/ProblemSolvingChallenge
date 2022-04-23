package practice;

public class SumOfDigitsUsingRecursion {
public static int fun(int n)
{
	if(n==0)
	{
		return 0;
	}
	return fun(n/10)+(n%10);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=253;
		System.out.println(fun(n));
	}

}
