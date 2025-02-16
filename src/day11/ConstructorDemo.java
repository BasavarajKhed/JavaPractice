package day11;

public class ConstructorDemo {
	
	int x,y;
	
	
	ConstructorDemo() //Default Constructor
	{
		x=100;
		y=200;
		
	}
	
	ConstructorDemo(int a,int b) // parameterization 
	{
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ConstructorDemo cd1=new ConstructorDemo();
		cd1.sum();
		ConstructorDemo cd=new ConstructorDemo(10,20);
		cd.sum();
		
		
	}

}
