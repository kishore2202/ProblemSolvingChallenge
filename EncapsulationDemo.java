package practice;

public class EncapsulationDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student("abc",15);
		obj.setName("xyz");
		obj.getName();
	}

}

class Student extends EncapsulationDemo{

	private String name;
	private int roll;
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
