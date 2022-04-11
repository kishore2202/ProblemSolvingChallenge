package practice;

import java.util.Scanner;

public class IntegerReverse {

	public static int reverse(int x) {
        int sum=0;
        while(x>0)
        {
            sum=(sum*10)+x%10;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=reverse(n);
        System.out.println(val);
    }
}
