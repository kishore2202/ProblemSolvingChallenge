package com.demo.scaler;

public class RangeSumQuery {

	public void printArray(long[] arr)
	{
		for(long i:arr)
		{
			System.out.print(i+" ");
		}
	}
	
	public long[] solve(int[] a, int[][] b)
	{
//		int[] res=new int[b.length];
//		for(int j=0;j<b.length;j++)
//		{
//			int sum=0;
//			int left=b[j][0];
//			int right=b[j][1];
//			for(int k=left;k<=right;k++)
//			{
//				sum+=a[k];
//			}
//			res[j]=sum;
//		}
//		return res;
		int n=a.length;
		int m=b.length;
		long[] prefix=new long[a.length];
		prefix[0]=a[0];
		for(int i=1;i<a.length;i++)
		{
			prefix[i]=prefix[i-1]+a[i];
		}
		long[] ans=new long[b.length];
		for(int i=0;i<m;i++)
		{
			if(b[i][0]>0)
			{
				ans[i]=prefix[b[i][1]]-prefix[b[i][0]-1];
			}
			else
			{
				ans[i]=prefix[b[i][1]];
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeSumQuery obj=new RangeSumQuery();
		int[] a= {1,2,3,4,5};
		int[][] b= {
					{0,3}, 
					{1,2}
				};
		long[] res=obj.solve(a,b);
		obj.printArray(res);
	}

}
