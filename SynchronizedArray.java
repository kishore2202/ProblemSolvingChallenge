package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.we have to create a synchronizedList
		List<String> list=Collections.synchronizedList(new ArrayList <String>());
		
		//2.add,traverse,remove-no need of explicit synchronization
		list.add("Hi");
		list.add("Hello");
		list.add("Welcome");
		
		//3.Explicit synchronization
		synchronized(list)
		{
			Iterator<String> itr=list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}
