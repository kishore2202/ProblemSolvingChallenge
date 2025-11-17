package com.demo.scaler;

public class CountFactors {

	public int solve(int a)
	{
		int c=0;
//		int temp=a;
//		int num=1;
//		while(temp!=0)
//		{
//			if(a%num==0)
//			{
//				c++;
//			}
//			num++;
//			temp--;
//		}
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountFactors obj=new CountFactors();
		int a=6;
		System.out.println(obj.solve(a));
	}

}
