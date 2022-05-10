package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<>(Arrays.asList(1,2,3,2,1,3,4,5,4,5,6,8,8));
		List<Integer> list=num.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	}

}
