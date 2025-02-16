package day10;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Basavaraj";
		emp1.esal=30000;
		emp1.eadd="Pune";
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Danush";
		emp2.esal=30000;
		emp2.eadd="Pune";
		emp2.display();
	}

}
