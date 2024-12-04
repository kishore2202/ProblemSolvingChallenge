package com.scaler.practice;

public class SecondLargestElement {

	public static int solve(int[] arr)
	{
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[index])
			{
				index=i;
			}
		}
		int ans=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[index])
			{
				ans=Math.max(ans, arr[i]);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,3,5,89,3};
		System.out.println(solve(arr));
	}

}
