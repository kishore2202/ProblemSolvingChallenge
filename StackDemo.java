package practice;

import java.util.Iterator;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.size());
		s.pop();
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
	}

}
