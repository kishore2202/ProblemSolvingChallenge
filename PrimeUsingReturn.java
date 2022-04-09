package practice;

import java.util.Scanner;

public class PrimeUsingReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int div=2;
		while(div<n)
		{
			if(n%div==0)
			{
				System.out.println("Composite Number");
				return;
			}
			div++;
		}
		System.out.println("prime");
	}

}
