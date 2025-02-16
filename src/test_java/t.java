package test_java;

class superClass 
{ 
	 public int calc(int a, int b) 
	{ 
		return 0; 
	} 
} 
class subClass extends superClass 
{ 
	public int calc(int a, int b) 
	{ 
		return 1; 
	} 
} 


public class t 
{ 
	public static void main(String args[]) 
	{ 
		subClass get = new subClass(); 
		System.out.println("x = " + get.calc(0, 1)); 
	} 
} 

