class Solution {
    public int searchInsert(int[] arr, int t) {
        int d=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==t)
		{
			d=i;
		}
		if(arr[i]!=t)
		{
			if(arr[i]<t)
			{
				d=i+1;
			}
		}
	}
	return d;
    }
}
