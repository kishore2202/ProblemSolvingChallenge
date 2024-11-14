package zohoprep;

public class RotateBTimes {

	public static void reverse(int arr[], int left,int right)
    {
        while(left<right)
        {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
	public static int[] solve(int[] A, int B)
	{
		B=B%A.length;
        if(B==0) return A;
        reverse(A,0,A.length-1);
        reverse(A,0,B-1);
        reverse(A,B,A.length-1);
        return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int b=2;
		int[] res=solve(arr,b);
		for(int i:res)
		{
			System.out.println(i);
		}
	}

}
