package com.demo.scaler;

public class GoodPair {

	public int solve(int[] a, int b)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(i!=j && a[i]+a[j]==b)
					return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodPair obj=new GoodPair();
		int[] a= {1,2,4};
		int b=4;
		System.out.println(obj.solve(a, b));
	}

}
