package demo;

import java.util.Scanner;

public class Assign {
	static Scanner sc=new Scanner(System.in);
	
	public static void addition()
	{
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		addition();
	}

}
