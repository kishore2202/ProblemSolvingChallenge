package com.demo.scaler;

public class MaxOrMin {

	public int solve(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}
		int sum=min+max;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxOrMin obj=new MaxOrMin();
		int[] arr= {1,2,3,4};
		System.out.println(obj.solve(arr));
	}

}
