package com.sample.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		List<Integer> sync = Collections.synchronizedList(arr);
		Iterator<Integer> itr=sync.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
