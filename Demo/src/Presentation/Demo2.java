package Presentation;

public class Demo2 {
 static int a;
 {
	 System.out.println("NSB");
 }
 
	static {
		a=2;
		System.out.println(a);;
		System.out.println("From Demo2");
		m2();
	
	}
	Demo2()
	{
		System.out.println("Con");
	}
	public static void m2()
	{
		System.out.println("m2 is executing");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		Demo2 d=new Demo2();
//		m2();
	}
}
