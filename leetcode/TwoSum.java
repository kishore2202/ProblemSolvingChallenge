package github;

public class TwoSum {
public static int[] twoSum(int[] arr,int target)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==target)
			{
				return new int[] {i,j};
			}
		}
	}
	return new int[] {-1,-1};
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,11,5};
		int target=9;
		System.out.println(twoSum(arr,target));
	}

}
