package mar13th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3.sumOfNaturalNumbers(10);
		MethodsDemo3.sumOfNaturalNumbers(100);
		MethodsDemo3.sumOfNaturalNumbers(1000);

	}

	public static void sumOfNaturalNumbers(int num)
	{
		int res=0;
		
		res=num*(num+1)/2;
		
		System.out.println("Sum of "+num+" natural numbers is "+res);
	}
}
