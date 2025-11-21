package com.demo.scaler;

public class EquilibriumIndex {

	public int solve(int[] a)
	{
		int sum=0, left=0;
		for(int i:a)
		{
			sum+=i;
		}
		for(int i=0;i<a.length;i++)
		{
			sum-=a[i];
			if(sum==left)
			{
				return i;
			}
			left+=a[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquilibriumIndex obj=new EquilibriumIndex();
		int[] a= {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(obj.solve(a));
	}

}
