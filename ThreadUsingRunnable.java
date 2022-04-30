package practice;

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		Thread t1=new Thread(obj);
		t1.start();
	}
}

class B implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
		}
	}
}