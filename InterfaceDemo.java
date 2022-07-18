package Class;

interface A
{
	abstract void Hi();
}
class B implements A
{
	public void Hi() 
	{
		System.out.println("Hi....");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.Hi();
	}
}
