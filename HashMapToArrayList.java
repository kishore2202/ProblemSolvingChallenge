package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> a1=new HashMap<String,Integer>();
		a1.put("Zoho", 1000);
		a1.put("IBM", 2000);
		a1.put("TCS", 3000);
		a1.put("Infosys", 4000);
		a1.put("Google", 5000);
		
		List<String> l1=new ArrayList<String>(a1.keySet());
		for(String i:l1)
		{
			System.out.println(i);
		}
		System.out.println("--------");
		List<Integer> l2=new ArrayList<Integer>(a1.values());
		for(int i:l2)
		{
			System.out.println(i);
		}
		
	}

}
