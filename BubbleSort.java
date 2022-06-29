package practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,6,1,11,9};
		boolean flag=false;
		int n=arr.length-1;
		for(int i=0;i<n;i++)
		{
			int pointer=0;
			for(int j=1;j<=n-i;j++)
			{
				if(arr[pointer]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[pointer];
					arr[pointer]=temp;
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
