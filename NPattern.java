package practice;

public class NPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n-1||j==0||i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
