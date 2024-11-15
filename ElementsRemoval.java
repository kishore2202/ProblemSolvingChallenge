import java.util.Arrays;

public class ElementsRemoval {

	public static int solve(int[] A)
	{
		Arrays.sort(A);
		int sum = 0;
        for(int i:A)
        {
            sum+=i;
        }
        int total=sum;
        for(int i=A.length-2;i>=0;i--)
        {
            sum=sum-A[i+1];
            total+=sum;
        }
		return total;
	}
	/*
 		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum+=(A.length-i)*A[i];
		}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,2,1};
		System.out.println(solve(arr));
	}

}
