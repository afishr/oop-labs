package lab5.task1.top10;

public class B extends A
{
	protected String b;
	
	public B(String val, X x)
	{
		super(val, x);
		b = "B: " + val;
	}
	
	public void printState()
	{
		System.out.println("Current state: " + b);
		System.out.println("Current state: " + x.getX());
		super.printState();
	}
}
