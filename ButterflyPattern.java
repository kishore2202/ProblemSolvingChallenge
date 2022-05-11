package Collections;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int m=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j||j==m)
				{
				System.out.print("* ");
				}
				else
					System.out.print("  ");
				if(j==m)
				{
					m--;
				}
			}
			System.out.println();
		}
	}

}
