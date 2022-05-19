package practice;

public class LinearSearch {

	public static int linear(int[] arr,int element)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,6,3,8,2};
		System.out.println(linear(arr,6));
	}

}

