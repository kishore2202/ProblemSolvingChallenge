package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeMap;
public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<>();
		num.add(2);
		num.add(2);
		num.add(1);
		num.add(4);
		num.add(1);
		num.add(4);
		num.add(3);
		num.add(3);
		
		LinkedHashSet<Integer> ll=new LinkedHashSet<Integer>(num);
		ArrayList<Integer> nums=new ArrayList<>(ll);
		System.out.println(nums);
	}

}
