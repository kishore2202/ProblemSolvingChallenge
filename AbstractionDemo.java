package practice;

public abstract class AbstractionDemo {

	public void call() 
        {
		System.out.println("Calling....");
	}
	public void record() 
        {
		System.out.println("Recording.....");
	}

	abstract public void msg();
	
	abstract class Abc extends AbstractionDemo{

	abstract public void msg();

}
}
