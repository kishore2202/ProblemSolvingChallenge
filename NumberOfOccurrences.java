package practice;

import java.util.ArrayList;
import java.util.List;

public class NumberOfOccurrences {

	public static String solve(String str)
	{
		String res="";
		List<Character> list=new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			int c=1;
			if(!(list.contains(str.charAt(i))))
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						c++;
					}
				}
				res+=str.charAt(i);
				res+=c;
				list.add(str.charAt(i));
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="lastlasttasl";
		System.out.println(solve(str));
	}

}
