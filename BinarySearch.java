package practice;

public class BinarySearch {
public static int binary(int[] arr,int element)
{
	int s=0;
	int e=arr.length-1;
	while(s<=e)
	{
		int mid=(s+e)/2;
		if(element<arr[mid])
		{
			e=mid-1;
		}
		else if(element>arr[mid])
		{
			s=mid+1;
		}
		else
		{
			return mid;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int i=binary(arr,1);
		System.out.println("The index position is "+i);
	}

}
