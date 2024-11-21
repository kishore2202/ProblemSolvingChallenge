package Test;

public class CheckSumAlgorithm {

	public static int solve(int n)
	{
		int i=0;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			if(i%2==0)
			{
				r*=2;
				sum+=r;
			}
			else
			{
				sum+=r;
			}
			if(sum>9)
			{
				sum-=9;
			}
			i++;
			n/=10;
		}
		if(sum%10==0)
		{
			return sum;
		}
		return Math.abs(sum-10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		System.out.println(solve(n));
	}

}
