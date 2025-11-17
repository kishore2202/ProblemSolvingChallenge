package com.demo.scaler;

/*
Output 1:
[3, 4, 1, 2]
 */
public class ArrayRotation {

	public void printArray(int[] a)
	{
		for(int i:a)
		{
			System.out.println(i+" ");
		}
	}
	
	public int[] solve(int[] A, int B)
	{
		  B=B%A.length;
	      if(B==0){
	          return A;
	      }
	      reverse(A,0,A.length-1);
	      reverse(A,0,B-1);
	      reverse(A,B,A.length-1);
	      return A;
	}
	
	public int[] reverse(int[] arr, int start, int end)
	{
        while(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotation obj=new ArrayRotation();
		int[] a= {1,2,3,4,5};
		int b=2;
		int[] res=obj.solve(a, b);
		obj.printArray(res);
	}

}
