package practice;

import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> arr=new TreeSet<Integer>();
		arr.add(12);
		arr.add(11);
		arr.add(14);
		arr.add(13);
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		Iterator itr = arr.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
