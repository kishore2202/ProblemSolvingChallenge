/* Output
1 1 3 
2 1 2 
1 3 2
*/
package com.scaler.practice.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class TowerOfHanoi {

	static ArrayList<ArrayList<Integer>> arr;
	public static void towerOfHanoi(int n, int src, int dest, int temp)
	{
		if(n==0)
			return ;
		//move n-1 disks from src to temp via dest
		towerOfHanoi(n-1, src, temp, dest);
		arr.add(new ArrayList(Arrays.asList(n,src,dest)));
		//move n-1 disks from temp to dest via src
		towerOfHanoi(n-1,temp, dest, src);
	}
	public static int[][] solve(int n)
	{
		arr=new ArrayList<>();
		towerOfHanoi(n,1,2,3);
		return convertToPrimitiveArray(arr);
	}
	public static int[][] convertToPrimitiveArray(ArrayList<ArrayList<Integer>> arrayList) {
        return arrayList.stream()
                .map(rowList -> rowList.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int[][] res=solve(n);
		for(int i[]: res)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
