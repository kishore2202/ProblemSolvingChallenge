package com.scaler.practice;

public class GoodSubArrays {

	public static int solve(int[] arr, int b)
	{
		int tot=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int len=0;
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					len++;
					sum+=arr[k];
				}
				if(len%2==0 && sum<b)
				{
					tot++;
				}
				else if(len%2!=0 && sum>b)
				{
					tot++;
				}
			}
		}
		return tot;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7,9,2,4,6,8};
		int b=9;
		System.out.println(solve(arr,b));
	}

}
