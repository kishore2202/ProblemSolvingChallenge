package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoodBadArray {

	public static boolean solve(int[] arr)
	{
		List<Integer> list=new ArrayList<>();
		int max=0;
		for(int i:arr)
		{
			max=Math.max(max, i);
		}
		for(int i=1;i<=max;i++)
		{
			list.add(i);
		}
		list.add(max);
		Arrays.sort(arr);
		if(list.size()!=arr.length)
		{
			return false;
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=list.get(i))
				{
					return false;
				}
			}
		}
		return true;
	}
    public static void main(String[] args) {
        int[] arr= {1,1};
        System.out.println(solve(arr));
    }
}
