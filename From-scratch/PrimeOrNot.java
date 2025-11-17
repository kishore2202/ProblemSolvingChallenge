package com.demo.scaler;

public class PrimeOrNot {

	public String isPrime(int n)
	{
		if(n==0 || n==1)
			return "Prime";
		else 
		{
			int div=2;
			while(div<n)
			{
				if(n%div==0)
					return "Not a prime";
				div++;
			}
		}
		return "Prime";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		PrimeOrNot obj=new PrimeOrNot();
		System.out.println(obj.isPrime(a));

	}

}
