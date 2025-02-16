package day13;

public class ThisKeyWord {
	int x, y;

/*	ThisKeyWord(int x, int y) {
		this.x = x;
		this.y = y;
	}
*/
	void testData(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		ThisKeyWord th = new ThisKeyWord();
		th.testData(10, 20);
		th.display();
	}

}
