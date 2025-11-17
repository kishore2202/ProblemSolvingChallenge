package com.demo.scaler;

public class ReverseInRange {

	public void printArray(int a[])
	{
		for(int i:a)
		{
			System.out.println(i+" ");
		}
	}
	
	public int[] solve(int[] a, int b, int c)
	{
		while(c>b)
		{
			int temp=a[b];
			a[b]=a[c];
			a[c]=temp;
			c--;
			b++;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInRange obj=new ReverseInRange();
		int[] arr= {1,2,3,4};
		int b=2;
		int c=3;
		int[] res=obj.solve(arr, b, c);
		obj.printArray(res);
	}

}
