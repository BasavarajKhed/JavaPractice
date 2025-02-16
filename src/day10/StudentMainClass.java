package day10;

public class StudentMainClass {

	public static void main(String[] args) {
		Student stu1 = new Student();

		stu1.stuid = 123456;
		stu1.stuname = "Praveen";
		stu1.stugrad = 'A';

		stu1.display();

		stu1.stuid = 1234569;
		stu1.stuname = "Avinash";
		stu1.stugrad = 'S';

		stu1.display();

	}

}
