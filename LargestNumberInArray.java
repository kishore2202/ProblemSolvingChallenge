package abc;

import java.util.Scanner;
public class LargestNumberInArray {
public static int[] getArray()
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the element in "+i+"th pos : ");
		a[i]=s.nextInt();
	}
	return a;
}
public static int largest(int[] a)
{
	int max=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=getArray();
		int lar=largest(a);
		System.out.println("LARGEST VALUE IS : "+lar);
	}
}
