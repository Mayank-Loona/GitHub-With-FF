package demo;
interface i1
{
	public static void m1()
	{
		System.out.println("from staic interfacr");
	}
}
public class Possibilities implements i1{

	public static void main(String[] args) {
		i1.m1();
		
	}
	
	
	
}