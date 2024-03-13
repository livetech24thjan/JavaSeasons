package mar13th;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		MethodsDemo2 obj=new MethodsDemo2();
		
		obj.sumOfNaturalNumbers(10);
		
		obj.sumOfNaturalNumbers(100);
		
		obj.sumOfNaturalNumbers(1000);

	}

	public void sumOfNaturalNumbers(int num)
	{
		int res=0;
		
		res=num*(num+1)/2;
		
		System.out.println("Sum of "+num+" natural numbers is "+res);
	}
}
