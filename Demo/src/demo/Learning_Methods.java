package demo;

public class Learning_Methods {
	public static void main(String[] args) {
		add(10,20);
	}
	public static int add(int a ,int b)
	{
		int c=a+b;
		sub(20,30);
		System.out.println(c);
		return c;
	}
	public static int sub(int a ,int b)
	{
		int c=a-b;
		mul(30, 40);
		System.out.println(c);
		return c;
	}
	public static int mul(int a ,int b)
	{
		int c=a*b;
		System.out.println(c);
		return c;
		
	}
	
}
