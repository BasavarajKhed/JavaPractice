package day11;

public class Student {

	int stuid;
	String sname;
	char grad;
	
	
	void printStudentData() {
		System.out.println(stuid+"  "+sname+" "+grad);
		

	}
	
/*	void setStudentData(int id,String name,char gr) {
		stuid=id;
		sname=name;
		grad=gr;
		
	}
	*/
	
	Student(int id,String name,char gr){
		stuid=id;
		sname=name;
		grad=gr;
	}
	
	
	
}
