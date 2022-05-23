package github;

public class LargestAmongDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12397;
		int min=9;
		int max=0;
		while(n!=0)
		{
			int r=n%10;
			min=Math.min(r, min);
			max=Math.max(r, max);
			n=n/10;
		}
		System.out.println("Maximum digit is "+max);
		System.out.println("Minimum digit is "+min);
	}

}
