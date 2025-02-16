package pk;

public class t {
	public static void main(String[] args) {
		int num=4;
		int i=2;
		while(num>=i)
		{
			if (num %i==0)
			{
		     	break;
			}
			i++;
		}
		if(num==i)
		System.out.println("prime no");
		else
			System.out.println("Not prime");
	}
}
