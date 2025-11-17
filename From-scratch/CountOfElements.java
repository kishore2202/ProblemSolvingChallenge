package com.demo.scaler;

public class CountOfElements {

	public int solve(int[] arr)
	{
		int count=0;
		int max=Integer.MIN_VALUE;
		for(int i:arr)
		{
			max=Math.max(max, i);
		}
		for(int i:arr)
		{
			if(max>i)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfElements obj=new CountOfElements();
		int[] arr= {5, 5, 3};
		System.out.println(obj.solve(arr));
	}

}
