package zohoprepBitManipulation;

public class SingleNumber {

	public static int solve(int[] arr)
	{
		int ans=0;
		for(int i:arr)
		{
			ans=ans^i;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 2, 3, 1};
		System.out.println(solve(arr));
	}

}
