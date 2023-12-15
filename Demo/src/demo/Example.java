package demo;

import java.util.Scanner;

class Example
{
	Scanner sc=new Scanner(System.in);
	String food=sc.next();
	
	Example(String food)
	{
		this.food=food;
	}
	public static void main(String[] args) {
		Example e=new Example("");
		System.out.println(e.food);
	}
}