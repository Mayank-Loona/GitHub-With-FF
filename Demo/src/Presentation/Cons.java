package Presentation;

public class Cons {
	int a=5;
	
	String s="mayank";
	boolean b;
	long l=9874536l;
	
	public Cons() {
		
	}
	Cons(int a,long l)
	{
		this.a=a;
		this.l=l;
	}
	Cons(String s)
	{
		this.s=s;
	
	}
	Cons(int a, String s,long l)
	{
		this(a,l);
		this.s=s;
		
		
		//this.s=s;
		
	}
	Cons(String s,int a)
	{
		
	}
	Cons(int a , int b)
	{
		
	}
	public static void main(String[] args) {
		Cons s=new Cons();
		System.out.println(s.s);
		System.out.println(s.a);
		System.out.println(s.l);
		
	}
	
}
