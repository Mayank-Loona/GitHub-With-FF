package demo;

public class Student {

	private String sname;
	String sId;
	int cls;
	static String schoolName="BMS";
	
	public void updateStudentName(String updateStudentName)
	{
	sname=	updateStudentName;
		
	}
	public void displayAllData()
	{
		System.out.println("Student Name " + sname);
		System.out.println("Student ID " + sId);
		System.out.println("Student Class " + cls);
		System.out.println("School Name "+ schoolName);
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.sname="Mayank";
		s.sId="BMS30";
		s.cls=8;
		s.displayAllData();
		
		System.out.println("===============================");
		
		Student s1=new Student();
		s1.updateStudentName("laddi");
		s1.cls=7;
		s1.sId="BMS27";
		s1.displayAllData();
		
		
		System.out.println("============================");
		Student s2=s1;
		s2.updateStudentName("rano");
		s2.cls=10;
		s2.sId="BMS56";
		s2.displayAllData();
	}
}
