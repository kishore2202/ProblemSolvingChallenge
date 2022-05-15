package Class;
class Co
{
	int a;
	int b;
	String c;
	public Co()
	{
	int a = 0;
	int b = 0;
	String c = "co";
	}
	public Co(int i) {
	int a=i;
	int b = 0;
	String c="co";
}
  
public Co(int i,int j) {
	int a=i;
	int b=j;
	String c="co";
}
public Co(int i,int j,String k) {
	int a=i;
	int b=j;
	String c=k;
}

}

public class ConstructorOverloading {
	public static void main(String[] args)
	{
		Calc obj=new Calc(4,3);
		System.out.println(obj.a);
		  System.out.println(obj.b);
	}
}