package demo;

class Parent{
	String name;
	public void test()
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	public void m1()
	{
		System.out.println("Child");
	}
	
}

public class Single_Level_Inheritance {

	public static void main(String[] args) {
		//Single_Level_Inheritance s=new Single_Level_Inheritance();
		Child c=new Child();
		c.m1();
		c.test();
	}
	
}
