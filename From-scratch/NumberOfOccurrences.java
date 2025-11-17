package com.demo.scaler;

public class NumberOfOccurrences {

	public int solve(int[] a,  int b)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfOccurrences obj=new NumberOfOccurrences();
		int[] a= {1,2,2,3};
		int b=2;
		System.out.println(obj.solve(a,b));
	}

}
