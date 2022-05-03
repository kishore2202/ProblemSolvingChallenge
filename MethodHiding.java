package practice;

public class MethodHiding {
	static int a=5;
	static int b=10;
public static void show() {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodHiding obj=new MethodHiding();
		MethodHiding obj1=new C();
		obj.show();
		obj1.show();
	}

}

class C extends MethodHiding{
	public static void show()
	{
		System.out.println(a+b);
	}
}