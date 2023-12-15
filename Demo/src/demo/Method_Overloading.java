package demo;

public class Method_Overloading {

	public void m1()
	{
		System.out.println("m1 is executing");
	}
	public void m1(int a,int b)
	{
		System.out.println("m2 is executing");
		System.out.println(a);
		System.out.println(b);
	}
	public void m1(String m)
	{
		System.out.println("m3");
		System.out.println(m);
	}
	public void m1(int a,String m)
	{
		System.out.println("m4");
		System.out.println(a);
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		Method_Overloading mo=new Method_Overloading();
		mo.m1();
		mo.m1("mayank");
		mo.m1(5, 6);
		mo.m1(0, null);
	}
}
