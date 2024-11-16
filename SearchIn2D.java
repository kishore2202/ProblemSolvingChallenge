public class SearchIn2D {
	
	public static int solve(int[][] arr, int b)
	{
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				if(arr[i][j]==b)
//				{
//					return (++i)*1009+(++j);
//				}
//			}
//		}
		int i=0;
		int j=arr[0].length-1;
		int ans=-1;
		while(i<arr.length && j>=0)
		{
			if(arr[i][j]>b)
			{
				j--;
			}
			else if (arr[i][j]<b)
			{
				i++;
			}
			else
			{
				for(int k=j;k>=0;k--)
				{
					if(arr[i][k]==b)
					{
						ans=((i+1)*1009+(k+1));
					}
				}
				break;
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1,2},{3,3}
				};
		int b=3;
		System.out.println(solve(arr,b));
	}

}
