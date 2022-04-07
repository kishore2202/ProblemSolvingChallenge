package practice;

/* This solution defines how to use variable arguments*/

public class Varags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main();
		System.out.println(obj.add(1,2,3,4,5));
	}
}
class Main
{
	public int add(int...n)
	//Here (int...n) used to pass 'n' numbers
	{
		int add=0;
		for(int i:n)
		{
			add=add+i;
		}
		return add;
	}
}