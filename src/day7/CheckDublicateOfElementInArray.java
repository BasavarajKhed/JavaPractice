package day7;

public class CheckDublicateOfElementInArray {

	public static void main(String[] args) {
		int a[]= {100,200,300,100,400,100,200};
		int count=0;
		int dup=200;
		
	/*	for(int i=0;i<=a.length-1;i++) {
			if(a[i]==dup) {
				count++;
			}
		
		}*/
		
		for(int value:a) {
			if(value==dup) {
				count++;
			}
		}
		
		
		System.out.println("Number of time the element repeated "+count);

	}

}
