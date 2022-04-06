package practice;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static ArrayList<Integer> rd(int[] arr)
	{
		ArrayList<Integer> res=new ArrayList<>();
		for(int i:arr)
		if(!res.contains(i))
		{
			res.add(i);
		}
		return res;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {1,1,2,3,4,2};
			ArrayList<Integer> res=rd(arr);
			System.out.println(res);
		}

}
