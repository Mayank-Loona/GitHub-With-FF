package demo;
class Person
{
	String sname;
	public Person(String sname) {
	super();
	this.sname=sname;
	}
}
class Students extends Person
{
	String sname;
	int id;
	public Students(String sname,int id) {
		// TODO Auto-generated constructor stub
	super(sname);
	this.id=id;
	}
}

public class Upcasting_Downcasting {
public static void main(String[] args) {
	Person p=new Students("Mayank",065);
	System.out.println(p.sname);
	
	Students s =(Students) p;
	System.out.println(s.id);;
	System.out.println(s.sname);

	
}
}
