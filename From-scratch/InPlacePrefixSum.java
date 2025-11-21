package com.demo.scaler;

public class InPlacePrefixSum {

	public int[] solve(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			arr[i]+=arr[i-1];
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InPlacePrefixSum obj=new InPlacePrefixSum();
		int[] arr= {1, 2, 3, 4, 5};
		int res[]=obj.solve(arr);
		for(int i:res)
		{
			System.out.print(i+" ");
		}
	}

}
