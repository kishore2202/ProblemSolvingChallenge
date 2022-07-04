package practice;

public class ArrayReverse {

	public static void reverse(int[] a,int n)
	{
	        int[] b = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {
	            b[j - 1] = a[i];
	            j = j - 1;
	        }
	  
	        for (int k = 0; k < n; k++) {
	            System.out.print(b[k]+" ");
	        } 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		reverse(arr,5);

		}
	
	}
