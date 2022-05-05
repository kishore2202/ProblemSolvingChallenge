package practice;

public class SubStringDemo {
public static void substring(String n)
{
	for(int i=0;i<=n.length()-1;i++)
	{
		for(int j=i;j<=n.length()-1;j++)
		{
			System.out.println(n.substring(i,j+1));
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="abcd";
		substring(n);
	}
}

