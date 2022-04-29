package practice;

import java.util.Arrays;

public class BubbleSortReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		boolean flag=false;
		int n=arr.length-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n-i-1;j++)
			{
				int pointer=0;
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=true;
				}
				pointer++;
			}
			if(!flag)
			{
				break;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
