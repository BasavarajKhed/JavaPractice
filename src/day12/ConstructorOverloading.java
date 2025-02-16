package day12;

public class ConstructorOverloading {
	double x,y,z;

	ConstructorOverloading() {
		x=y=z=0;
	}
	
	
	ConstructorOverloading(double a,double b,double c) {
		x = a;
		y = b;
		z = c;
		
	}
	
	ConstructorOverloading(double a) {
		x=y=z=a;
	}
	
	
	double  calculate() {
		return x*y*z;
	}

}
