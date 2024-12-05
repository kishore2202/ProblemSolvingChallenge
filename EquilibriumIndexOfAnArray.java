public class EquillibriumIndexOfAnArray {

	public static int solve(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int right=0;
			int left=0;
			for(int j=0;j<i;j++)
			{
				left+=arr[j];
			}
			for(int j=i+1;j<arr.length;j++)
			{
				right+=arr[j];
			}
			if(left==right)
			{
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1};
		System.out.println(solve(arr));
	}

}
