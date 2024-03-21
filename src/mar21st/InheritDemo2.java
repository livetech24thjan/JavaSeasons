package mar21st;

public class InheritDemo2 {

	public static void main(String[] args) {
		
		//case 1
		
		//P obj=new P();
		
		
		
		//case 2
		//C obj=new C();
		
		
		//case 3 invalid 
		//C obj=new P();
		
		//case 4 
		P obj=new C();
		System.out.println(obj.x);
		obj.m1();
	

	}

}
