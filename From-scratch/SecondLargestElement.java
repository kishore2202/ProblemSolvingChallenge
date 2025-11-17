public class SecondLargestElement {

	public int solve(int[] arr)
	{
		if(arr.length<2)
		{
			return -1;			
		}
		int fl=-1;
		int sl=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl && arr[i]!=fl)
			{
				sl=arr[i];
			}
		}
		return sl;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargestElement obj=new SecondLargestElement();
		int[] arr= {1,2,2,4};
		System.out.println(obj.solve(arr));
	}

}
