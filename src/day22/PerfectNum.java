package day22;

public class PerfectNum {

	public static void main(String[] args) {
		int num=6;
		
		int sum=0;
		
		
		for(int i=1;i<num;i++) {
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==num) {
			System.out.println("Given Number is Perfect Number");
		}
		
		else {
			System.out.println("Given Number is not a Perfect Number");
		}

	}

}
