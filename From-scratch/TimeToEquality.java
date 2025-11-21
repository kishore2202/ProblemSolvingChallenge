package com.demo.scaler;

import java.util.Arrays;

public class TimeToEquality {

	public int solve(int[] a)
	{
		int c=0;
		Arrays.sort(a);
		int n=a[a.length-1];
		for(int i=0;i<n;i++)
		{
			c+=(n-a[i]);
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeToEquality obj=new TimeToEquality();
		int[] a= {2,4,1,3,2};
		System.out.println(obj.solve(a));
	}

}
