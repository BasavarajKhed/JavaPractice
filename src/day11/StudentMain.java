package day11;

public class StudentMain {

	public static void main(String[] args) {
		
//		Student st=new Student();
	/*	st.stuid=101;
		st.sname="Basavaraj";
		st.grad='A';
		st.printStudentData();*/
		
		/*st.setStudentData(101, "Basavaraj", 'D');
		st.printStudentData();
		*/
		
		Student st=new Student(101, "Basavaraj",'A');
		st.printStudentData();
	}

}
