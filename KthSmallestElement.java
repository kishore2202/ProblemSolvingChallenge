public class KthSmallestElement {

	public static int solve(int[] arr, int b)
	{
		for(int i=0;i<b;i++)
		{
			int min=Integer.MAX_VALUE;
			int idx=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
					idx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
		return arr[b-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2};
		int b=2;
		System.out.println(solve(arr,b));
	}

}
