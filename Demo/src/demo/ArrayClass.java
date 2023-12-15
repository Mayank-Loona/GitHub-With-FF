package demo;

import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the numbers into an array");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		add(ar);
		
		
	}
	public static void add(int [] ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			
		}
		System.out.println(sum);
	}
}
