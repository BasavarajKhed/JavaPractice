package com.test;

import com.practice.Demo5;

public class Testing2 implements Demo5{

	@Override
	public void test() {
		System.out.println("Test");
		
	 }
       public static void main(String[] args) {
	  Testing2 as=new Testing2();
	    as.test();
}

}
