package Array;

public class ArrayMultiplication {

	
		public static void mul(int [] arr)
		{
		    for(int i=0;i<6;i++)
		    arr[i]=arr[i]*i;
		}
		
		public static void main (String[] args) {
		    int arr[]={1,2,3,4,5,6};
		    mul(arr);
		    for(int i=0;i<6;i++)
		    {
		        System.out.println(arr[i]);
		    }
		}
}
