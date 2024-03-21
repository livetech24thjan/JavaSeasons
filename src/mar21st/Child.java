package mar21st;

public class Child extends Parent{
	
	int x;
	
	public void putX(int x)
	{
		this.x=x;
	}
	
	public void greet()
	{
		System.out.println("Hi..Good Afternoon..");
	}
	public void displayAll()
	{
		System.out.println(super.x);
		System.out.println(x);
		super.greet();
		greet();
		
	}

}
