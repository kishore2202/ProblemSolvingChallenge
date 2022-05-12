package Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> m=new HashMap<String,String>();
		m.put("a", "android");
		m.put("b", "bandwidth");
		m.put("c", "catalog");
		m.put("d", "desktop");
		m.put("e", "encryption");
		System.out.println(m.get("a"));
	}

}
