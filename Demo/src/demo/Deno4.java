package demo;
class Ex
{
	static void m1()
	{
		System.out.println("EX1 is executing");
	}
}
class Ex2 extends Ex
{
	static void m1()
	{
		System.out.println("EX2 is executing");
	}
}

public class Deno4 {
public static void main(String[] args) {
	Ex e=new Ex();
	e.m1();//EX1
	
	Ex2 e1=new Ex2();
	e1.m1();//Ex2
	
	Ex e2=e1;
	e2.m1();//Ex1
	 
	Ex2 e3=(Ex2) e2;
	e3.m1();//ex2
	
	
}
	
}
