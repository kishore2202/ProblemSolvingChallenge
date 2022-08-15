package hh;

public class FibonacciSeries {
public static boolean prime(int i)
{
	boolean b=true;
	int div=2;
	while(div<i)
	{
		if(i%div==0)
		{
			b=false;
			break;
		}
		div++;
	}
	if(b)
	{
		return b;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		int n=10;
		int mm=2;
		int m=Integer.MIN_VALUE;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			if(prime(c) && c!=1)
			{
				mm=Math.min(c, mm);
				m=Math.max(c, m);
			}
		}
		System.out.println("min"+mm);
		System.out.println("max"+m);
	}

}
