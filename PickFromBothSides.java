package com.scaler.practice;

public class PickFromBothSides {

	public static int leftmostSum(int[] arr, int left)
	{
		int sum=0;
		for(int i=0;i<left;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int rightmostSum(int[] arr, int right)
	{
		int sum=0;
		int n=arr.length-1;
		for(int i=0;i<right;i++)
		{
			sum+=arr[n];
			n--;
		}
		return sum;
	}
	
	public static int solve(int[] arr, int b)
	{
		int max=Integer.MIN_VALUE;
		int left=b;
		int right=0;
		for(int i=0;i<b+1;i++)
		{
			int sum=leftmostSum(arr,left)+rightmostSum(arr,right);
			if(sum>max)
			{
				max=sum;
			}
			left--;
			right++;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,-1,3,2,7,8,10};
		int b=4;
		System.out.println(solve(arr,b));
	}

}
