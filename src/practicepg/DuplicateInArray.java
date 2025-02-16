package practicepg;

public class DuplicateInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 7};
		int count=1;
		int n=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					
				}
			}
		}

		if (count>1) {
			System.out.println("Dublicate Element  found ");
		}
		else {
			System.out.println("Dublicate Element not found ");
		}
	}

}
