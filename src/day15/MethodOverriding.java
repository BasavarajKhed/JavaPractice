package day15;

class Bank {
	double roi() {
		return 0;
	}
}

class ICICI extends Bank {
	double roi() {
		return 10;
	}
}

class SBI extends Bank {
	double roi() {
		return 11;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		ICICI iobj = new ICICI();
		System.out.println(iobj.roi());
		SBI sobj = new SBI();
		System.out.println(sobj.roi());

	}

}
