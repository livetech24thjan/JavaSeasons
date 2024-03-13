package mar13th;

public class MethodsDemo5 {

	public static void main(String[] args) {
		
		
		
		System.out.println(MethodsDemo5.sumOfNaturalNumbers(10));
		
		System.out.println(MethodsDemo5.sumOfNaturalNumbers(100));
		
		System.out.println(MethodsDemo5.sumOfNaturalNumbers(1000));

	}

	public static int sumOfNaturalNumbers(int num)
	{
		int res=0;
		
		res=num*(num+1)/2;
		
		//System.out.print("Sum of "+num+" Natural Numbers ");
		
		return res;
	}
}
