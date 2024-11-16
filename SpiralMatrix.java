public class SpiralMatrix {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[][] arr=new int[n][n];
		int row=0;
		int col=0;
		int c=1;
		while(n>0)
		{
			for(int k=1;k<=n-1;k++)
			{
				arr[row][col]=c++;
				col++;
			}
			for(int k=1;k<=n-1;k++)
			{
				arr[row][col]=c++;
				row++;
			}
			for(int k=1;k<=n-1;k++)
			{
				arr[row][col]=c++;
				col--;
			}
			for(int k=1;k<=n-1;k++) 
			{
				arr[row][col]=c++;
				row--;
			}
			row++;
			col++;
			n-=2;
			if(n%2!=0)
			{
				arr[row][col]=c;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j:arr[i])
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
