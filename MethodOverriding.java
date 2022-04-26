package practice;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj=new Child();
		obj.print();
		Parent obj1=new Child1();
		obj1.print();
	}
}

class Parent{
	int a,b;
	public void print()
	{
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	public void print()
	{
		System.out.println("Child class");
	}
}

class Child1 extends Parent{
	public void print()
	{
		System.out.println("Child class 2");
	}
}