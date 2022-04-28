package practice;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("abc");
		arr.add("def");
		arr.add("ghi");
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Hi");
		arr1.add("Hello");
		System.out.println(arr.addAll(arr1));
		
		ArrayList<String> cloneList=(ArrayList<String>)arr1.clone();
		System.out.println(cloneList);
		
		System.out.println(arr.indexOf("abc")>=0);
		
		ArrayList<String> str=new ArrayList<String>(Arrays.asList("mno","pqr","tuv"));
		System.out.println(str.lastIndexOf("mno"));
		
		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		num.removeIf(nums->nums%2==0);
		System.out.println(num);
		
		Object str2[]=num.toArray();
		System.out.println(Arrays.toString(str2));
		
	}

}
