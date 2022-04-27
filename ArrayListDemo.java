package practice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr=new ArrayList<Object>();
		//We can add any type of datatype values into the array.
		arr.add(11);
		arr.add("Hi");
		arr.add('a');
		arr.add(22.4);
		for(Object i:arr)
		{
			System.out.println(i);
		}
	}

}
