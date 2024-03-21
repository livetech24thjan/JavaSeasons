package mar20th;

public class InheritDemo1 {

	public static void main(String[] args) {
		
		Sum obj1=new Sum();
		obj1.setX(10);
		obj1.setY(20);
		obj1.add();
		
		Mul obj2=new Mul();
		obj2.setX(20);
		obj2.setY(30);
		obj2.prod();
		

	}

}
