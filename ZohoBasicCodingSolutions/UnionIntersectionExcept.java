package Test;

import java.util.ArrayList;
import java.util.List;

public class UnionIntersectionExcept {

	public static void print(List<Integer> l1)
	{
		for(int i:l1)
		{
			System.out.print(i+" ");
		}
	}
	public static void union(List<Integer> l1, List<Integer> l2)
	{
		List<Integer> union=new ArrayList<>();
		union.addAll(l1);
		for(int i:l2)
		{
			if(!(l1.contains(i)))
			{
				union.add(i);
			}
		}
		print(union);
	}
	public static void inter(List<Integer> l1, List<Integer> l2)
	{
		List<Integer> res=new ArrayList<>();
		for(int i:l1)
		{
			if(l2.contains(i))
			{
				res.add(i);
			}
		}
		print(res);
	}
	public static void except(List<Integer> l1, List<Integer> l2)
	{
		List<Integer> res1=new ArrayList<>();
		for(int i:l1)
		{
			if(i%2==0)
			{
				res1.add(i);
			}
		}
		for(int i:l2)
		{
			if(i%2!=0)
			{
				res1.add(i);
			}
		}
		print(res1);
	}
	public static void solve(String s1, String s2)
	{
		String[] str1=s1.split(" ");
		String[] str2=s2.split(" ");
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		for(int i=0;i<str1.length;i++)
		{
			list1.add(Integer.parseInt(str1[i]));
		}
		for(int i=0;i<str2.length;i++)
		{
			list2.add(Integer.parseInt(str2[i]));
		}
		union(list1, list2);
		System.out.println();
		inter(list1, list2);
		System.out.println();
		except(list1, list2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="1 2 5 3";
		String s2="1 7 5 8 9";
		solve(s1,s2);
	}

}
