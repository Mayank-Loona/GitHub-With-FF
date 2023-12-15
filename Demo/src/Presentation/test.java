package Presentation;

public class test {
	static int a;
	int b;
	static {
		a=5;
		System.out.println("Static block");
		System.out.println(a);
		
	}
	{
		b=10;
		System.out.println("NSB");
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println("From Main Method");
		test t=new test();
	}
	static
	{
		System.out.println("From Static 2");
		a=9;
		System.out.println(a);
	}
}
