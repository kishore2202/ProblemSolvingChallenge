package practice;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj=new Abc();
		System.out.println(obj.add(1, 1));
		System.out.println(obj.add(22.3, 43.2));
		System.out.println(obj.add(1, 44.2));
	}
}
class Abc{
int a,b;

public int add(int a,int b)
{
	return a+b;
}
public double add(double a,double b)
{
	return a+b;
}
}