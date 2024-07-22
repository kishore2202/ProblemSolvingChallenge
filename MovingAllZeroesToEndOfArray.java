public class Main
{
	public static void main(String[] args) {
		int[] arr={1,2,3,0,4,5,0,7,8,0};
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]!=0)
		    {
		        arr[c++]=arr[i];
		    }
		}
		while(c<arr.length)
		{
		    arr[c++]=0;
		}
		for(int i:arr)
		{
		    System.out.println(i);
		}
	}
}
