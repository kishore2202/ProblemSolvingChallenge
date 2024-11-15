public class GenerateSubArrays
{
  public static int[][] solve(int[] arr)
	{
		int n=arr.length;
		int length=n*(n+1)/2;
		int index=0;
		int[][] ans=new int[length][];
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int p=0;
				ans[index]=new int[j-i+1];
				for(int k=i;k<=j;k++)
				{
					ans[index][p++]=arr[k];
				}
				index++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int[][] res=solve(arr);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.println(res[i][j]);
			}
		}
	}
}
