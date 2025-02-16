package p.array;

public class TestAr {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6,1,1 };

		int num = 1;
		boolean status = false;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
//				System.out.println("Element found "+a[i]);
				count++;
//				status = true;
//				break;

			}
		}

//		if(status==false) {
//			System.out.println("Not Found ");
//		}
		System.out.println(count);
	}

}
