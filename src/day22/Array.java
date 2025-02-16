package day22;

public class Array {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5};

		int linear_num=a[0];
		boolean status=false;
	
		for(int i=0;i<a.length;i++) 
		
		{
			if(a[i]==linear_num) 
			{
				System.out.println("Element found ");
				status=true;
				break;
			}
		}
		
		
		if(status==false) {
			System.out.println("Element not found ");
		}
		

	}

}
