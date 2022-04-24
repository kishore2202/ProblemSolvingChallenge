package practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> arr=new HashSet<>();
		arr.add(12);
		arr.add(11);
		arr.add(13);
		arr.add(11);
		arr.add(13);
		arr.add(12);
		Iterator itr = arr.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}