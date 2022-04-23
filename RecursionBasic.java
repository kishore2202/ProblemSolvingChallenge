package practice;

public class RecursionBasic {
public static void recursion(int n)
{
	/* Initially n=2,n!=0 so it doesn't return.it prints hi and n is 
	 * decremented by 1 then it goes into if and 1!=0 it prints hi again
	 * now n is 0, it goes to if and 0==0 then it exits.
	 */
	if(n==0)
	{
		return;
	}
	System.out.println("Hi");
	recursion(n-1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		recursion(n);
	}

}
