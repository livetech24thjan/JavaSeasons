package mar13th;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		MethodsDemo4 obj=new MethodsDemo4();
		
		System.out.println(obj.sumOfNaturalNumbers(10));
		
		System.out.println(obj.sumOfNaturalNumbers(100));
		
		System.out.println(obj.sumOfNaturalNumbers(1000));

	}

	public int sumOfNaturalNumbers(int num)
	{
		int res=0;
		
		res=num*(num+1)/2;
		
		//System.out.print("Sum of "+num+" Natural Numbers ");
		
		return res;
	}
}
