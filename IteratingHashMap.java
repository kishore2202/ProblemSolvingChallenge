package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class IteratingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> m=new HashMap<String,String>();
		m.put("a", "android");
		m.put("b", "bandwidth");
		m.put("c", "catalog");
		m.put("d", "desktop");
		m.put("e", "encryption");
		Iterator<String> itr=m.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			String value=m.get(key);
			System.out.println(key+":"+value);
		}
		
		/* OR */
		System.out.println("-----------------------");
		
		m.forEach((k,v)->System.out.println(k+":"+v));
	}

}
