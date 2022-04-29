package practice;
import java.util.Arrays;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,9,6,1,7,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int min=i;
				if(arr[min]>arr[j])
				{
					min=j;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
	}

}
