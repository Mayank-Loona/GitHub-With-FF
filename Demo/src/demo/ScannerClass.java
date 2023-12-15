package demo;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int i=sc.nextInt();
		System.out.println(i);
		System.out.println("Enter the name");
		sc.nextLine();
		String s=sc.nextLine();
		
		System.out.println(s);
		System.out.println("Enter last name");
		String s1=sc.nextLine();
		System.out.println(s1);
		
		System.out.println("Enter last name");
		String s2=sc.nextLine();
		System.out.println(s2);
	}
}
